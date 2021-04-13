package com.jcmdsbr.timesheet.repositories

import com.jcmdsbr.timesheet.entities.Employee
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository<Employee, String> {
    fun findByEmail(email: String): Employee?
    fun findByDocument(document: String): Employee?
}