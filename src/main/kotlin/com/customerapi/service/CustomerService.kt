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


    fun createCustomer(customer: CustomerModel){
        var id = if(customers.isEmpty()){
            1
        }
        else{
            customers.last().id!! + 1
        }
        customer.id = id
        customers.add(customer)
    }

    fun getCustomerById( id: Int ): CustomerModel{
        return customers.filter { it.id ==id }.first()
    }

    fun updateCustomer(customer: CustomerModel){
        return customers.filter { it.id == customer.id }.first().let {
            it.email = customer.email
            it.name = customer.name
            it.gender = customer.gender
        }
    }

    fun deleteCustomer( id: Int){
        customers.removeIf { it.id == id }
    }


}