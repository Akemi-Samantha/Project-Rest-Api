package com.customerapi.controllers.dto.request

import javax.persistence.Column

data class PutAddressRequest(

    var state: String,

    var city: String,

    var neighborhood: String,

    var zipCode: String,

    var street : String,

    var number: String,

    var additionalInformation: String,

    var main: Boolean,
)
