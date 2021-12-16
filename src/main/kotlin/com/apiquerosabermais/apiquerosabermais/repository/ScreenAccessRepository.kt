package com.apiquerosabermais.apiquerosabermais.repository

import com.apiquerosabermais.apiquerosabermais.model.ScreenAccessModel
import org.springframework.data.repository.CrudRepository

interface ScreenAccessRepository: CrudRepository<ScreenAccessModel, Int> {
    abstract fun findAllByUserId(userId: Int): MutableList<ScreenAccessModel>
}