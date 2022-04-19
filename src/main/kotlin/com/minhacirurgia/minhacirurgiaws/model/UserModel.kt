package com.minhacirurgia.minhacirurgiaws.model

import com.minhacirurgia.minhacirurgiaws.model.enum.SurgeryType
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotEmpty


@Entity(name = "user")
data class UserModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column
    var name: String,
    @Column
    var email: String,
    @Column
    @Enumerated(EnumType.STRING)
    var surgery: SurgeryType,
    @Column
    var birthdate: String,
    @Column
    var password: String,
    @Column
    var date_register: LocalDateTime = LocalDateTime.now()
) {
    data class UserLogin(
        @field:NotEmpty(message = "Email deve ser informado.")
        val email: String,
        @field:NotEmpty(message = "A senha deve ser informada")
        val password: String){}
}