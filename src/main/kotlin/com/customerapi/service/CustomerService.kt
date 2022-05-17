package com.customerapi.service

import com.customerapi.model.CustomerModel
import com.customerapi.repository.CustomerRepository
import com.customerapi.repository.RepositoryTest
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable

@Service

class CustomerService(
    val customerRepository: CustomerRepository
) {
// verificar o name?.let
    fun getAll(name:String?, id: Int?): List<CustomerModel>{

        name?.let{
            return customerRepository.findAllByNameOrId(name,id)
        }
        return customerRepository.findAll().toList()
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