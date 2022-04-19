package com.minhacirurgia.minhacirurgiaws.repository

import com.minhacirurgia.minhacirurgiaws.model.UserModel
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<UserModel, Int> {
    abstract fun existsByEmail(email: String): Boolean
    abstract fun findByEmail(email: String): UserModel?
}