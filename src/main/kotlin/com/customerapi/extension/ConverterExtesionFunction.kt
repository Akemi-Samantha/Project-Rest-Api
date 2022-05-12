package com.customerapi.extension

import com.customerapi.controllers.dto.request.PostCustomerRequest
import com.customerapi.controllers.dto.request.PutCustomerRequest
import com.customerapi.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email, birth_date = this.birthDate, cpf = this.cpf, gender = this.gender/* , address = this.address */)
}

fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel{
    return CustomerModel(id = id, name = this.name, email = this.email, gender = this.gender )
}