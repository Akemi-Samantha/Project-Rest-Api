package com.customerapi.repository

import com.customerapi.model.CustomerModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface RepositoryTest:CrudRepository<CustomerModel, Int> {
}