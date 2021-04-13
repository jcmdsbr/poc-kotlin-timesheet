package com.jcmdsbr.timesheet.repositories

import com.jcmdsbr.timesheet.entities.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {
    fun findByDocument(document: String): Company?
}