package com.customerapi.model

import javax.persistence.*

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
    var main: Boolean? = null,
    @ManyToOne
    @JoinColumn(name = "id_customer")
    var customer: CustomerModel? = null

)
