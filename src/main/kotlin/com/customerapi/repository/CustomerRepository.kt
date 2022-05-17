package com.customerapi.repository

import com.customerapi.model.CustomerModel
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository: JpaRepository<CustomerModel, Int > {

    fun findAllByNameOrId(name: String?, id: Int?):List<CustomerModel>

}