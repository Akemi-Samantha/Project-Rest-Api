package com.customerapi.extension

import com.customerapi.controllers.dto.request.PostAddressRequest
import com.customerapi.controllers.dto.request.PostCustomerRequest
import com.customerapi.controllers.dto.request.PutCustomerRequest
import com.customerapi.model.AddressModel
import com.customerapi.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email, birthDate = this.birthDate, cpf = this.cpf, gender = this.gender, mainAddress = this.address)
}

fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel{
    return CustomerModel(id = id, name = this.name, email = this.email, gender = this.gender )
}

// Addresses

fun PostAddressRequest.toAddressModel(customer: CustomerModel): AddressModel {
    return AddressModel(
        state = this.state,
        city = this.city,
        neighborhood = this.neighborhood,
        zipCode = this.zipCode,
        number = this.number,
        street = this.street,
        additionalInformation = this.additionalInformation,
        main = this.main,
        customer = customer
    )
}


