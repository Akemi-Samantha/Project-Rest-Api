package com.customerapi.controllers.dto.response

import com.customerapi.model.AddressModel
import java.util.*
import javax.persistence.*

data class CustomerResponse(

    var id: Int? = null,
    var uuid: UUID? = null,
    var name: String? = null,
    var email: String? = null,
    val birthDate: String? = null,
    val cpf: String? = null,
    var gender: String? = null,
    var mainAddress: AddressModel? = null
) {
}
