package com.jcmdsbr.timesheet.repositories

import com.jcmdsbr.timesheet.entities.Entry
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface EntryRepository : MongoRepository<Entry, String> {
    fun findByEmployeeId(employeeId: String, pageable: Pageable): Page<Entry>
}