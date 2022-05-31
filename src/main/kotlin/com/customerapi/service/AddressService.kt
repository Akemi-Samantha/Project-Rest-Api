package com.customerapi.service

import com.customerapi.model.AddressModel
import com.customerapi.repository.AddressRepository
import org.hibernate.criterion.NotEmptyExpression
import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable


@Service
class AddressService(
    @Autowired
   var addressRepository: AddressRepository

   ) {


    fun createAddress( address: AddressModel){
        addressRepository.save(address)
    }
    
    fun findByCustomerId(customer: Int?): List<AddressModel> {

        if (customer ==  null) {
            return getAll()
        }
        return addressRepository.findByCustomerId(customer)

    }

    fun getFindByIdAddress(id: Int): AddressModel {
        return addressRepository.findById(id).orElseThrow()
    }

    fun getAll(): List<AddressModel> {
        return addressRepository.findAll().toList()
    }

    fun delete(id: Int) {
        if(!addressRepository.existsById(id)){
            throw Exception("Id não encontrado")
        }
        addressRepository.deleteById(id)
    }

}


