package com.jcmdsbr.timesheet.dtos


data class CompanyDto(
    val name: String,
    val document: String,
    val id: String? = null
)