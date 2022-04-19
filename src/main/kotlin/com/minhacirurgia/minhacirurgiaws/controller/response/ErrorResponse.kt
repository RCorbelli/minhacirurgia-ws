package com.minhacirurgia.minhacirurgiaws.controller.response

data class ErrorResponse(
    var httpCode: Int,
    var message: String,
    var internalCode: String,
    var error: List<FieldErrorResponse>? = null
)