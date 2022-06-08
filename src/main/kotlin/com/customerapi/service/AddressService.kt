package com.customerapi.service

import com.customerapi.model.AddressModel
import com.customerapi.model.CustomerModel
import com.customerapi.repository.AddressRepository
import com.customerapi.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service


@Service
class AddressService(
    @Autowired
   var addressRepository: AddressRepository,
    val customerRepository: CustomerRepository

   ) {


    fun createAddress( address: AddressModel){
        addressRepository.save(address)
    }
    
    fun findByCustomerId(customer: Int?): List<AddressModel> {

        customer?.let{
            return addressRepository.findByCustomerId(customer)
        }
        return addressRepository.findAll().toList()
    }

    fun getFindByIdAddress(id: Int): AddressModel {
        return addressRepository.findById(id).orElseThrow()
    }

    fun getAll(): List<AddressModel> {
        return addressRepository.findAll().toList()
    }

    fun delete(id: Int){
        customerRepository.deleteById(id)
       return addressRepository.deleteById(id)
    }

}


