package com.apiquerosabermais.apiquerosabermais.service

import com.apiquerosabermais.apiquerosabermais.controller.UserController
import com.apiquerosabermais.apiquerosabermais.model.UserModel
import com.apiquerosabermais.apiquerosabermais.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
) {

    fun userNameAvailable(userName: String): Boolean {
        return !userRepository.existsByUserName(userName)
    }

    fun create(user: UserModel){
        val userValid = userNameAvailable(user.userName)
        if(userValid){
            userRepository.save(user)
        }else{
            throw Exception("userName já cadastrado!")
        }
    }

    fun login(userLogin: UserModel.UserLogin): UserModel {
        val user = userRepository.findByUserName(userLogin.userName)
        if(user.password == userLogin.password){
            return user.copy(password = "********")
        }else{
            throw Exception("Não foi possível fazer login")
        }
    }
}