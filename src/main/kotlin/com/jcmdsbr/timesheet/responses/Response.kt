package com.jcmdsbr.timesheet.responses

data class Response<T>(
    val errors: ArrayList<String> = arrayListOf(),
    var data: T? = null,
)
