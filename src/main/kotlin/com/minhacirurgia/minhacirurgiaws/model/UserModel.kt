package com.minhacirurgia.minhacirurgiaws.model

import com.minhacirurgia.minhacirurgiaws.model.enum.SurgeryType
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*


@Entity(name = "user")
data class UserModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(name = "user_name")
    var userName: String,
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
    class UserLogin(val userName: String, val password: String){}
}