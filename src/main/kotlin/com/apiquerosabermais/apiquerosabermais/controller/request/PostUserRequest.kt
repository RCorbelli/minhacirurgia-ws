package com.apiquerosabermais.apiquerosabermais.controller.request

import com.apiquerosabermais.apiquerosabermais.model.UserModel
import java.util.*
import javax.validation.constraints.NotEmpty

data class PostUserRequest (
    @field:NotEmpty(message = "userName deve ser informado.")
    var userName: String,
    @field:NotEmpty(message = "Nome deve ser informado.")
    var name: String,
    @field:NotEmpty(message = "Cirurgia deve ser informada.")
    var surgery: String,
    var birthdate: Date,
    @field:NotEmpty(message = "Sua cidade deve ser informada.")
    var location: String,
    @field:NotEmpty(message = "Senha deve ser informada")
    var password: String,
){
    fun toUserModel(): UserModel {
        return UserModel(
            name = this.name,
            userName = this.userName,
            surgery = this.surgery,
            birthdate = this.birthdate,
            location = this.location,
            password = this.password)
    }
}