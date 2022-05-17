package com.customerapi.controllers

import com.customerapi.controllers.dto.request.PostAddressRequest
import com.customerapi.controllers.dto.request.PostCustomerRequest
import com.customerapi.controllers.dto.request.PutCustomerRequest
import com.customerapi.extension.toCustomerModel
import com.customerapi.model.CustomerModel
import com.customerapi.repository.RepositoryTest
import com.customerapi.service.AddressService
import com.customerapi.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("customers")

class CustomersController(
    var customerService: CustomerService,
    val repositoryTest: RepositoryTest,
    var addressController: AddressController
) {

    val customers = mutableListOf<CustomerModel>()

    @GetMapping
    fun getAll(@RequestParam name:String?, id:Int?): List<CustomerModel>{
        return customerService.getAll(name, id)
    }

    @PostMapping("/createCustomer")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun createCustomer(@RequestBody customer:PostCustomerRequest ): CustomerModel {
        println(customer)
      val result =  repositoryTest.save(customer.toCustomerModel())
        return result
    }

    @GetMapping("/getCustomerById/{id}",)
    fun getCustomerById(@PathVariable id: Int ): CustomerModel{
        return customerService.getCustomerById(id)
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun updateCustomer(@PathVariable id: Int, @RequestBody customer: PutCustomerRequest){
        customerService.updateCustomer(customer.toCustomerModel(id))
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun deleteCustomer(@PathVariable id: Int){
        return customerService.deleteCustomer(id)
    }

}