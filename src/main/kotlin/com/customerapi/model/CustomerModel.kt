package com.customerapi.model

import java.util.UUID
import javax.persistence.*


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
    @Column(name = "birth_date")
    val birthDate: String? = null,
    @Column
    val cpf: String? = null,
    @Column
    var gender: String? = null,
    @ManyToOne(cascade = arrayOf(CascadeType.ALL))//,mappedBy="customer")
    @JoinColumn(name = "customer")
    var mainAddress: AddressModel? = null
)
//  @JoinTable(name = "CustomerAddress"
//            joinColumns = @JoinColumn(name = "main_address_id"),
//            inverseJoinColumns = @JoinColumn(name = "customer_id"))