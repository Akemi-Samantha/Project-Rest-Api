package com.customerapi.model

data class CustomerModel(

    var id: Int,
    var name: String,
    var email: String,
    val birthDate: String,
    val cpf: String,
    var gender: String,
    // var mainAddress: AddressCustomerModel

)
