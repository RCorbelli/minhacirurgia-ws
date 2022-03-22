package com.minhacirurgia.minhacirurgiaws.service

import com.minhacirurgia.minhacirurgiaws.controller.UserController
import com.minhacirurgia.minhacirurgiaws.model.UserModel
import com.minhacirurgia.minhacirurgiaws.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
) {

    fun userNameAvailable(userName: String): Boolean {
        return !userRepository.existsByUserName(userName)
    }

    fun emailAvailable(email: String): Boolean {
        return !userRepository.existsByEmail(email)
    }

    fun create(user: UserModel){
        val userValid = userNameAvailable(user.userName)
        val emailValid = emailAvailable(user.email)
        if(userValid){
            if(emailValid){
                userRepository.save(user)
            }else {
                throw Exception("email já cadastrado!")
            }
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