package com.jcmdsbr.timesheet.dtos

import com.jcmdsbr.timesheet.fixed.Profile

data class EmployeeDto(
    val name: String,
    val email: String,
    val password: String,
    val document: String,
    val profile: Profile,
    val companyId: String,
    val priceHour: Double? = 0.0,
    val workedHours: Float? = 0.0f,
    val lunchHours: Float? = 0.0f,
    val id: String? = null
)