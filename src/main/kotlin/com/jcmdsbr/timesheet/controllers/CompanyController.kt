package com.jcmdsbr.timesheet.controllers

import com.jcmdsbr.timesheet.entities.Company
import com.jcmdsbr.timesheet.responses.Response
import com.jcmdsbr.timesheet.services.CompanyService
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/company")
class CompanyController (val companyService: CompanyService) {
    @Value("\${paginate}")
    val paginate = 15


    @GetMapping("{document}")
    fun findByDocument(@PathVariable("document") doc : String)
    : ResponseEntity<Response<Company>> =
        ResponseEntity.ok(Response(data = companyService.findByDocument(doc)))
}