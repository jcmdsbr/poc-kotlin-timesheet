package com.jcmdsbr.timesheet.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Company(val name: String, val document: String, @Id val id: String? = null)