package com.customerapi.service

import com.customerapi.controllers.dto.request.PutCustomerRequest
import com.customerapi.model.CustomerModel
import com.customerapi.repository.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody

@Service

class CustomerService(
    val customerRepository: CustomerRepository
) {

    val customers = mutableListOf<CustomerModel>()

    fun getAll(name:String?): List<CustomerModel>{

        name?.let{
            return customers.filter { it.name.contains(name,true) }
        }
        return customers
    }


    fun createCustomer(customer: CustomerModel){
        customerRepository.save(customer)
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