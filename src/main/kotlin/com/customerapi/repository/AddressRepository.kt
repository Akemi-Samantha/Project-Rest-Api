package com.customerapi.repository

import com.customerapi.model.AddressModel
import com.customerapi.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface AddressRepository:CrudRepository <AddressModel, Int >{
    fun findByIdCustomer(customer: CustomerModel):List<AddressModel>

}