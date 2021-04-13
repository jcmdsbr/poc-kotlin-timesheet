package com.jcmdsbr.timesheet

import com.jcmdsbr.timesheet.entities.Company
import com.jcmdsbr.timesheet.entities.Employee
import com.jcmdsbr.timesheet.fixed.Profile
import com.jcmdsbr.timesheet.repositories.CompanyRepository
import com.jcmdsbr.timesheet.repositories.EmployeeRepository
import com.jcmdsbr.timesheet.shared.PasswordHelper
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TimesheetApplication(
    val companyRepository: CompanyRepository,
    val employeeRepository: EmployeeRepository
) : CommandLineRunner {

    override fun run(vararg args: String?) {
        companyRepository.deleteAll()
        employeeRepository.deleteAll()
        val company =  companyRepository.save(Company("Fake Company", "95.268.028/0001-10"))
        val companyId = company.id!!
        val adm = Employee(
            "Admin",
            "admin@gmail.com",
            password = PasswordHelper().generateBCrypt("123456"),
            document = "828.852.430-31",
            Profile.ROLE_ADM,
            companyId,
        )
        employeeRepository.save(adm)
        val basic = Employee(
            "Basic",
            "Basic@gmail.com",
            password = PasswordHelper().generateBCrypt("123456"),
            document = "478.938.360-16",
            Profile.ROLE_BASIC,
            companyId
        )
        employeeRepository.save(basic)
    }
}


fun main(args: Array<String>) {
    runApplication<TimesheetApplication>(*args)
}
