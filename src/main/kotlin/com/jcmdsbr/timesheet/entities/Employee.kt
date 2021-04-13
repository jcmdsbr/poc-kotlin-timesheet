package com.jcmdsbr.timesheet.entities

import com.jcmdsbr.timesheet.fixed.Profile
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee(
    val name: String,
    val email: String,
    val password: String,
    val document: String,
    val profile: Profile,
    val companyId: String,
    val priceHour: Double? = 0.0,
    val workedHours: Float? = 0.0f,
    val lunchHours: Float? = 0.0f,
    @Id val id: String? = null
)