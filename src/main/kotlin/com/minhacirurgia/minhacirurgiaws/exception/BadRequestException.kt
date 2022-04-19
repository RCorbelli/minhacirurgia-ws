package com.minhacirurgia.minhacirurgiaws.exception

class BadRequestException(
    override val message: String,
    val errorCode: String
): Exception() {
}