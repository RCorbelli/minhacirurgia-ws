package com.minhacirurgia.minhacirurgiaws.service

import com.minhacirurgia.minhacirurgiaws.model.SurgeryTimeModel
import com.minhacirurgia.minhacirurgiaws.repository.SurgeryTimeRepository
import org.springframework.stereotype.Service

@Service
class SurgeryTimeService (
    private val surgeryTimeRepository: SurgeryTimeRepository
) {
    fun create(surgeryTimeModel: SurgeryTimeModel): String{
        val surgery: SurgeryTimeModel?  = surgeryTimeRepository.findByUserId(surgeryTimeModel.userId)
        if(surgery != null){
            surgeryTimeRepository.save(surgery.copy(surgeryTime = surgeryTimeModel.surgeryTime))
            return "Data atualizada com sucesso!"
        }else{
            surgeryTimeRepository.save(surgeryTimeModel)
            return "Data salva com sucesso!"
        }
    }

    fun findSurgeryTime(userId: Int): SurgeryTimeModel? {
        return surgeryTimeRepository.findByUserId(userId)
    }
}
