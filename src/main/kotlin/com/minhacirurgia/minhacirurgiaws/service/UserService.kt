package com.minhacirurgia.minhacirurgiaws.service

import com.minhacirurgia.minhacirurgiaws.exception.BadRequestException
import com.minhacirurgia.minhacirurgiaws.model.UserModel
import com.minhacirurgia.minhacirurgiaws.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userRepository: UserRepository,
) {
    fun emailAvailable(email: String): Boolean {
        return !userRepository.existsByEmail(email)
    }

    fun create(user: UserModel){
//        val emailValid = emailAvailable(user.email)
            userRepository.save(user)
        }

    fun login(userLogin: UserModel.UserLogin): UserModel {
        val user = userRepository.findByEmail(userLogin.email)
        if(user != null){
            if(user.password == userLogin.password){
                return user.copy(password = "********")
            }else{
                throw BadRequestException("Senha incorreta", "11113")
            }
        }else{
            throw BadRequestException("Email incorreto", "11112")
        }
    }
}