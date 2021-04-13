package com.jcmdsbr.timesheet.entities

import com.jcmdsbr.timesheet.fixed.Status
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Entry(
    val createdAt: Date,
    val status: Status,
    val employeeId: String?,
    val description: String? = "",
    @Id val id: String? = null
)