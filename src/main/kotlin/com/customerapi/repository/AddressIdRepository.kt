package com.customerapi.repository

import com.customerapi.model.AddressModel
import org.springframework.data.repository.CrudRepository

interface AddressIdRepository: CrudRepository<List<AddressModel>, Int> {
}