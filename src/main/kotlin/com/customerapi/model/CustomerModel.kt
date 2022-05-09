package com.customerapi.model

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "tb_test")
    data class CustomerModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var uuid: UUIDGenerator? = null,
    @Column
    var name: String,
    @Column
    var email: String? = null,
    @Column
    val birthDate: String? = null,
    @Column
    val cpf: Long? = null,
    @Column
    var gender: String? = null,
    // var mainAddress: AddressCustomerModel

)
