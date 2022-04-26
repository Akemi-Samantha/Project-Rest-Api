package com.customerapi.service

import com.customerapi.controllers.dto.request.PostCustomerRequest
import com.customerapi.controllers.dto.request.PutCustomerRequest
import com.customerapi.model.CustomerModel
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

@Service

class CustomerService {

    val customers = mutableListOf<CustomerModel>()

    fun getAll(name:String?): List<CustomerModel>{

        name?.let{
            return customers.filter { it.name.contains(name,true) }
        }
        return customers
    }


    fun createCustomer(customer: PostCustomerRequest){
        var id = if(customers.isEmpty()){
            1
        }
        else{
            customers.last().id + 1
        }
        customers.add(CustomerModel(id, customer.name ,customer.email, customer.birthDate, customer.cpf,customer.gender))
    }

    fun getCustomerById(@PathVariable id: Int ): CustomerModel{
        return customers.filter { it.id ==id }.first()
    }

    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest){
        return customers.filter { it.id == id }.first().let {
            it.email = customer.email
            it.name = customer.name
            it.gender = customer.gender
        }
    }

    fun deleteCustomer(@PathVariable id: Int){
        customers.removeIf { it.id == id }
    }


}