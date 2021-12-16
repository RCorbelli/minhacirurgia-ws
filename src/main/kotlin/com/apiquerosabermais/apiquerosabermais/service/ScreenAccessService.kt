package com.apiquerosabermais.apiquerosabermais.service

import com.apiquerosabermais.apiquerosabermais.model.ScreenAccessModel
import com.apiquerosabermais.apiquerosabermais.repository.ScreenAccessRepository
import org.springframework.stereotype.Service

@Service
class ScreenAccessService(
    private val screenAccessRepository: ScreenAccessRepository,
) {

    fun create(screenAccess: ScreenAccessModel){
        screenAccessRepository.save(screenAccess)
    }

    fun findAllByUserId(userId: Int): MutableList<ScreenAccessModel>{
        return screenAccessRepository.findAllByUserId(userId)
    }
}