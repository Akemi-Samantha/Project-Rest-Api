package com.customerapi.controllers.dto.request

data class PostCustomerRequest(

    var name: String,
    var email: String,
    val birthDate: String,
    val cpf: String,
    var gender: String,
)
