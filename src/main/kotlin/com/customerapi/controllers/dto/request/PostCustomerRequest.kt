package com.customerapi.controllers.dto.request

data class PostCustomerRequest(

    var name: String,
    var email: String,
    val birthDate: Long,
    val cpf: Long,
    var gender: String,
)
