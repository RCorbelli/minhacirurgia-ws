package com.minhacirurgia.minhacirurgiaws.model

import com.minhacirurgia.minhacirurgiaws.model.enum.SurgeryType
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.persistence.*
import javax.validation.constraints.NotEmpty


@Entity(name = "surgery_time")
data class SurgeryTimeModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,
    @Column(name = "user_id")
    var userId: Int,
    @Column(name = "surgery_time")
    var surgeryTime: String

)