package com.jcmdsbr.timesheet.services.impl

import com.jcmdsbr.timesheet.entities.Entry
import com.jcmdsbr.timesheet.repositories.EntryRepository
import com.jcmdsbr.timesheet.services.EntryService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class EntryServiceImpl(val repository: EntryRepository) : EntryService {
    override fun findByEmployeeId(employeeId: String, pageable: PageRequest): Page<Entry> =
        repository.findByEmployeeId(employeeId, pageable)

    override fun findById(id: String): Optional<Entry> = repository.findById(id)

    override fun save(entry: Entry): Entry = repository.save(entry)

    override fun deleteById(id: String) = repository.deleteById(id)
}