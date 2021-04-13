package com.jcmdsbr.timesheet.services.impl

import com.jcmdsbr.timesheet.entities.Employee
import com.jcmdsbr.timesheet.repositories.EmployeeRepository
import com.jcmdsbr.timesheet.services.EmployeeService
import org.springframework.stereotype.Service
import java.util.*

@Service
class EmployeeServiceImpl(val repository: EmployeeRepository) : EmployeeService {
    override fun findById(id: String): Optional<Employee> = repository.findById(id)

    override fun findByEmail(email: String): Employee? = repository.findByEmail(email)

    override fun findByDocument(document: String): Employee? = repository.findByDocument(document)

    override fun save(employee: Employee): Employee? = repository.save(employee)
}