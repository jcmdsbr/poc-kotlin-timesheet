package com.jcmdsbr.timesheet.services

import com.jcmdsbr.timesheet.entities.Entry
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import java.util.*

interface EntryService {
    fun findByEmployeeId(employeeId: String, pageable: PageRequest): Page<Entry>
    fun findById(id: String): Optional<Entry>
    fun save(entry: Entry): Entry
    fun deleteById(id: String)
}