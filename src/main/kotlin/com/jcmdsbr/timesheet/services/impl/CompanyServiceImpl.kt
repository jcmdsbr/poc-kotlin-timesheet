package com.jcmdsbr.timesheet.services.impl

import com.jcmdsbr.timesheet.entities.Company
import com.jcmdsbr.timesheet.repositories.CompanyRepository
import com.jcmdsbr.timesheet.services.CompanyService
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl(val repository: CompanyRepository) : CompanyService {
    override fun findByDocument(document: String): Company? = repository.findByDocument(document)

    override fun save(company: Company): Company = repository.save(company)
}