package com.jcmdsbr.timesheet.services

import com.jcmdsbr.timesheet.entities.Employee
import java.util.*

interface EmployeeService {
    fun findById(id: String): Optional<Employee>
    fun findByEmail(email: String): Employee?
    fun findByDocument(document: String): Employee?
    fun save(employee: Employee): Employee?
}