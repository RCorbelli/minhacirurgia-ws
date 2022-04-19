package com.minhacirurgia.minhacirurgiaws.controller.request

import com.minhacirurgia.minhacirurgiaws.model.SurgeryTimeModel

data class PostSurgeryTimeRequest (
    var userId: Int,
    var surgeryTime: String
){
    fun toSurgeryModel(): SurgeryTimeModel{
        return SurgeryTimeModel(
            userId = this.userId,
            surgeryTime = this.surgeryTime
        )
    }
}