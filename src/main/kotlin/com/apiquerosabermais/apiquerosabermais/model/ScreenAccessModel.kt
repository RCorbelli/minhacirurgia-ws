package com.apiquerosabermais.apiquerosabermais.model

import java.time.LocalDateTime
import java.util.*
import javax.persistence.*


@Entity(name = "screen_access")
data class ScreenAccessModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "screen_id")
    var screenId: Int,
    @Column(name = "user_id")
    var userId: Int,
    @Column(name = "access_time")
    var accessTime: LocalDateTime = LocalDateTime.now(),
) {
}