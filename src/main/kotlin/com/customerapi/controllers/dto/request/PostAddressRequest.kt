package com.customerapi.controllers.dto.request

import com.fasterxml.jackson.annotation.JsonAlias

data class PostAddressRequest(
    var state: String,
    var city: String,
    var neighborhood: String,
    var zipCode: String,
    var street: String,
    var number: String,
    var additionalInformation: String,
    var main: Boolean,
    @JsonAlias("customer_id")
    var customerId: Int
)
