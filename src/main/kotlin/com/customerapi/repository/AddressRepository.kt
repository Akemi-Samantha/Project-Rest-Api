package com.customerapi.repository

import com.customerapi.model.AddressModel
import org.springframework.data.repository.CrudRepository

interface AddressRepository:CrudRepository <AddressModel, Int >{
     fun findByCustomerId(customer: Int?): List<AddressModel>


}