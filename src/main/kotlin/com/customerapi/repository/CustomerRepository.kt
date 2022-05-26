package com.customerapi.repository

import com.customerapi.model.CustomerModel
import org.springframework.data.repository.CrudRepository

interface CustomerRepository: CrudRepository<CustomerModel, Int > {

    fun findAllByNameOrId(name: String?, id: Int?):List<CustomerModel>

}