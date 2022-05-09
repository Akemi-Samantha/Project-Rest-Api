package com.customerapi.service

import com.customerapi.controllers.dto.request.PutCustomerRequest
import com.customerapi.model.CustomerModel
import com.customerapi.repository.CustomerRepository
import org.springframework.data.repository.findByIdOrNull
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
        return customerRepository.findById(id).orElseThrow()
    }

    fun updateCustomer(customer: CustomerModel){

        if(!customerRepository.existsById(customer.id!!)){
            throw Exception("Id não encontrado")
        }
        customerRepository.save(customer)
    }

    fun deleteCustomer(@PathVariable id: Int){
        if(!customerRepository.existsById(id)){
            throw Exception("Id não encontrado")
        }
        customerRepository.deleteById(id)
    }


}