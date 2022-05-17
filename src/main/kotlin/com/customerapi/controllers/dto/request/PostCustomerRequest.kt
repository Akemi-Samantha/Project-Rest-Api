package com.customerapi.controllers.dto.request

import com.customerapi.model.AddressModel

data class PostCustomerRequest(

    var name: String,
    var email: String,
    val birthDate: String,
    val cpf: String,
    var gender: String,
    var address: AddressModel
)
