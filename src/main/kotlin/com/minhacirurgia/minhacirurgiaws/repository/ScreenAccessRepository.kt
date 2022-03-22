package com.minhacirurgia.minhacirurgiaws.repository

import com.minhacirurgia.minhacirurgiaws.model.ScreenAccessModel
import org.springframework.data.repository.CrudRepository

interface ScreenAccessRepository: CrudRepository<ScreenAccessModel, Int> {
    abstract fun findAllByUserId(userId: Int): MutableList<ScreenAccessModel>
}