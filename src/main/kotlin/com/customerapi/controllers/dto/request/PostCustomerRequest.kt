package com.customerapi.controllers.dto.request

import com.customerapi.controllers.dto.request.PostAddressRequest as PostAddressRequest1

data class PostCustomerRequest(

    var name: String,
    var email: String,
    val birthDate: String,
    val cpf: String,
    var gender: String,
    var address: PostAddressRequest1
)
