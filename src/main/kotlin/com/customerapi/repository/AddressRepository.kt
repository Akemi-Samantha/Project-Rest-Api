package com.customerapi.repository

import com.customerapi.model.AddressModel
import org.springframework.data.repository.CrudRepository

interface AddressRepository:CrudRepository <AddressModel, Int >{
     fun findByIdCustomer(customerId: Int): List<AddressModel>
     fun deleteById(findIdCustomer: List<AddressModel>)

}