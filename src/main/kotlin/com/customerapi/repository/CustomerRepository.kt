package com.customerapi.repository

import com.customerapi.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<CustomerModel, Int > {

    fun findAllByName(name: String?):List<CustomerModel>

}