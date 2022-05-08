package com.customerapi.model

import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator
import com.fasterxml.jackson.core.JsonParser.NumberType
import org.hibernate.type.BigDecimalType
import org.hibernate.type.UUIDBinaryType
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
    @Column(name = "uuid_customer")
    var uuid: UUIDGenerator? = null,
    @Column(name = "name_customer")
    var name: String,
    @Column(name = "email_customer")
    var email: String? = null,
    @Column(name = "birthDate_customer")
    val birthDate: Long? = null,
    @Column (name = "cpf_customer")
    val cpf: Long? = null,
    @Column (name = "gender_customer")
    var gender: String? = null,
    // var mainAddress: AddressCustomerModel

)
