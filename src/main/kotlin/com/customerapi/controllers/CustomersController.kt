package com.customerapi.controllers

import com.customerapi.controllers.dto.request.PostCustomerRequest
import com.customerapi.controllers.dto.request.PutCustomerRequest
import com.customerapi.extension.toCustomerModel
import com.customerapi.model.CustomerModel
import com.customerapi.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customers")

class CustomersController(
    var customerService: CustomerService
) {

    @GetMapping
    fun getAll(@RequestParam name:String?): List<CustomerModel>{
        return customerService.getAll(name)
    }

    @PostMapping("/createCustomer")
    @ResponseStatus(HttpStatus.CREATED)
    fun createCustomer(@RequestBody customer: PostCustomerRequest): CustomerModel {
        return customerService.create(customer)
    }


    @GetMapping("/getCustomerById/{id}",)
    fun getCustomerById(@PathVariable id: Int ): CustomerModel{
        return customerService.getCustomerById(id)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest){
        customerService.updateCustomer(customer.toCustomerModel(id))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCustomer(@PathVariable id: Int){
        return customerService.deleteCustomer(id)
    }

}