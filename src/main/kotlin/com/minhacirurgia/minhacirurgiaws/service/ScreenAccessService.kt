package com.minhacirurgia.minhacirurgiaws.service

import com.minhacirurgia.minhacirurgiaws.model.ScreenAccessModel
import com.minhacirurgia.minhacirurgiaws.repository.ScreenAccessRepository
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