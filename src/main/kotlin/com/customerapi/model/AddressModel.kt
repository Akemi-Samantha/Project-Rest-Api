package com.customerapi.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "tb_address_api")
data class AddressModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column
    var state: String? = null,
    @Column
    var city: String? = null,
    @Column
    var neighborhood: String? = null,
    @Column
    var zipCode: String? = null,
    @Column
    var number: Int? = null,
    @Column
    var additionalInformation: String? = null,
    @Column
    var main: Boolean? = null


)
