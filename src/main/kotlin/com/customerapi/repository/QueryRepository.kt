//package com.customerapi.repository
//import com.customerapi.model.AddressModel
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param
//
//
//interface QueryRepository :JpaRepository <AddressModel, Int >{
//
//    @Query("FROM tb_address_api  WHERE customer_id = :customer_id")
//    fun findByIdCustomer(@Param("customer_id") customerId: Int):
//            List<AddressModel>
//
//
//}
