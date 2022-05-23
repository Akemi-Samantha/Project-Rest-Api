//package com.customerapi.repository
//import com.customerapi.model.AddressModel
//import com.customerapi.model.CustomerModel
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param
//
//
//interface QueryRepository :JpaRepository <AddressModel, Int >{
//
//    @Query("SELECT customer_id FROM tb_address_api  WHERE customer_id = :customer_id")
//    fun findByIdCustomer(@Param("customer_id") customerId: CustomerModel):
//            List<AddressModel>
//
//
//}
