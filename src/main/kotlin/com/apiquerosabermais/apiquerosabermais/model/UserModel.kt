package com.apiquerosabermais.apiquerosabermais.model

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
    var surgery: String,
    @Column
    var birthdate: Date,
    @Column
    var location: String,
    @Column
    var password: String,
) {
    class UserLogin(val userName: String, val password: String){}
}