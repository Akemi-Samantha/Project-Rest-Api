package com.customerapi.controllers

import com.customerapi.controllers.dto.request.PostCustomerRequest
import com.customerapi.controllers.dto.request.PutCustomerRequest
import com.customerapi.model.CustomerModel
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customers")

class CustomersController {

    val customers = mutableListOf<CustomerModel>()

    @GetMapping
    fun getAll(): List<CustomerModel>{
        return customers
    }

    @PostMapping
    fun createCustomer(@RequestBody customer: PostCustomerRequest){
       var id = if(customers.isEmpty()){
           1
       }
        else{
            customers.last().id + 1
       }
        customers.add(CustomerModel(id, customer.name ,customer.email, customer.birthDate, customer.cpf,customer.gender))
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Int ): CustomerModel{
        return customers.filter { it.id ==id }.first()
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest){
            return customers.filter { it.id == id }.first().let {
                    it.email = customer.email
                    it.name = customer.name
                    it.gender = customer.gender
            }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCustomer(@PathVariable id: Int){
        customers.removeIf { it.id == id }
    }




}