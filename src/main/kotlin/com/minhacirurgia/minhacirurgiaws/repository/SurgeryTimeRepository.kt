package com.minhacirurgia.minhacirurgiaws.repository

import com.minhacirurgia.minhacirurgiaws.model.SurgeryTimeModel
import org.springframework.data.jpa.repository.JpaRepository

interface SurgeryTimeRepository: JpaRepository<SurgeryTimeModel, Int> {
    fun findByUserId(userId: Int): SurgeryTimeModel?
}