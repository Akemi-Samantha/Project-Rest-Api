package com.customerapi.controllers

import com.customerapi.controllers.dto.request.PostAddressRequest
import com.customerapi.extension.toAddressModel
import com.customerapi.model.AddressModel
import com.customerapi.service.AddressService
import com.customerapi.service.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("address")

class AddressController(
   var addressService: AddressService,
   var customerService: CustomerService
) {

    @PostMapping("/createAddress")
    @ResponseStatus(HttpStatus.CREATED)
    fun createAddress(@RequestBody request: PostAddressRequest) {
        val customer = customerService.getCustomerById(request.customerId)
        addressService.createAddress(request.toAddressModel(customer))
    }

    // precisa fazer retornar o customerId, aparentemente ele n está sendo reconhecido...
    //Verificar pesquisa sobre relacionamento bidirecional...
    //@ManyToMany - pesquisar


    @GetMapping("/findByCustomerId/{customer}")
    fun findByCustomerId(@PathVariable customer: Int ): List<AddressModel>{
        return addressService.findByCustomerId(customer)
    }


    @GetMapping("/getFindByIdAddress/{id}")
    fun getFindByIdAddress(@PathVariable id:Int):AddressModel{
        return addressService.getFindByIdAddress(id)
    }



// @PutMapping
// @DeleteMapping

}