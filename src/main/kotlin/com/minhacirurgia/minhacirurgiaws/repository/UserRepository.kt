package com.minhacirurgia.minhacirurgiaws.repository

import com.minhacirurgia.minhacirurgiaws.model.UserModel
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<UserModel, Int> {
    abstract fun existsByUserName(userName: String): Boolean
    abstract fun findByUserName(userName: String): UserModel
    abstract fun existsByEmail(email: String): Boolean
}