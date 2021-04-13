package com.jcmdsbr.timesheet.services

import com.jcmdsbr.timesheet.entities.Company

interface CompanyService {
    fun findByDocument(document: String): Company?
    fun save(company: Company): Company
}