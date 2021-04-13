package com.jcmdsbr.timesheet.dtos

import com.jcmdsbr.timesheet.fixed.Status
import java.util.*

data class EntryDto(
    val createdAt: Date,
    val status: Status,
    val employeeId: String?,
    val description: String? = "",
    val id: String? = null
)