package com.customerapi.model

data class CustomerModel(

    var id: Int? = null,
    var name: String,
    var email: String,
    val birthDate: String? = null,
    val cpf: String? = null,
    var gender: String? = null
    // var mainAddress: AddressCustomerModel

)
