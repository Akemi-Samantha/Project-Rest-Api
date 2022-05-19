package com.customerapi.service

import com.customerapi.model.AddressModel
import com.customerapi.repository.AddressRepository
import com.customerapi.repository.QueryRepository
import org.springframework.stereotype.Service


@Service
class AddressService(
   var addressRepository: AddressRepository,
   var queryRepository: QueryRepository
   ) {


    fun createAddress( address: AddressModel){
        addressRepository.save(address)
    }

    fun getAllAddress(): List<AddressModel>{
        return addressRepository.findAll().toList()
    }

    fun getByIdCustomer(customerId: Int): List<AddressModel> {
        return addressRepository.findByIdCustomer(customerId)
    }

    fun getFindByIdAddress(id: Int): AddressModel {
        return addressRepository.findById(id).orElseThrow()

    }

    fun deleteAddress(id: Int) {
        val findIdCustomer = getByIdCustomer(id)
        addressRepository.deleteById(findIdCustomer)
    }

//    fun updateAddress(toAddressModel: Any) {
//
//    }


}