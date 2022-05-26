package com.customerapi.service

import com.customerapi.model.AddressModel
import com.customerapi.repository.AddressRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Service
class AddressService(
    @Autowired
   var addressRepository: AddressRepository

   ) {


    fun createAddress( address: AddressModel){
        addressRepository.save(address)
    }

//    fun getAllAddress(): List<AddressModel>{
//        return addressRepository.findAll().toList()
//    }

    fun findByCustomerId(customer: Int): AddressModel {
        return addressRepository.findByCustomerId(customer)
    }


//    fun getFindByIdAddress(id: Int): AddressModel {
//        return addressRepository.findById(id).orElseThrow()
//
//    }

}