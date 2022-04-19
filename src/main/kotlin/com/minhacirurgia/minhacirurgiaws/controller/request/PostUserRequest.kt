package com.minhacirurgia.minhacirurgiaws.controller.request

import com.minhacirurgia.minhacirurgiaws.model.UserModel
import com.minhacirurgia.minhacirurgiaws.model.enum.SurgeryType
import com.minhacirurgia.minhacirurgiaws.validation.EmailAvailable
import java.time.LocalDate
import java.util.*
import javax.validation.constraints.NotEmpty

data class PostUserRequest (
    @field:NotEmpty(message = "Nome deve ser informado.")
    var name: String,
    var surgery: SurgeryType,
    @field:NotEmpty(message = "Email deve ser informado.")
    @EmailAvailable
    var email: String,
    var birthdate: String,
    @field:NotEmpty(message = "Senha deve ser informada")
    var password: String,
){
    fun toUserModel(): UserModel {
        return UserModel(
            name = this.name,
            email = this.email,
            surgery = this.surgery,
            birthdate = this.birthdate,
            password = this.password
            )
    }
}