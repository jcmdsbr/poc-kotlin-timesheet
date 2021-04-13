package com.jcmdsbr.timesheet.shared

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordHelper {
    fun generateBCrypt(pass: String): String = BCryptPasswordEncoder().encode(pass)
}