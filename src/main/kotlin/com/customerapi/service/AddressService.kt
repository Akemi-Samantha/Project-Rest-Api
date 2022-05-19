package com.customerapi.service

import com.customerapi.model.AddressModel
import com.customerapi.repository.AddressRepository
import org.springframework.stereotype.Service


@Service
class AddressService(
   var addressRepository: AddressRepository
) {


    fun createAddress( address: AddressModel){
        addressRepository.save(address)
    }

    fun getAllAddress(): List<AddressModel>{
        return addressRepository.findAll().toList()
    }

//    fun getByIdCustomer(customerId: Int): List<AddressModel> {
//        return addressRepository.findByIdCustomer(customerId)
//    }

//    fun getFindByIdAddress(id: Int): AddressModel {
//        return addressRepository.findById(id).orElseThrow()
//
//    }

}