package com.apiquerosabermais.apiquerosabermais.repository

import com.apiquerosabermais.apiquerosabermais.model.UserModel
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<UserModel, Int> {
    abstract fun existsByUserName(userName: String): Boolean
    abstract fun findByUserName(userName: String): UserModel
}