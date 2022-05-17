package com.customerapi.model

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "tb_customer_api")
    data class CustomerModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @GeneratedValue(strategy = GenerationType.AUTO)
    var uuid: UUID? = null,
    @Column
    var name: String? = null,
    @Column
    var email: String? = null,
    @Column
    val birth_date: String? = null,
    @Column
    val cpf: String? = null,
    @Column
    var gender: String? = null,
    // var mainAddress: AddressCustomerModel

)
