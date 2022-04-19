package com.minhacirurgia.minhacirurgiaws.controller

import com.minhacirurgia.minhacirurgiaws.controller.request.PostSurgeryTimeRequest
import com.minhacirurgia.minhacirurgiaws.model.SurgeryTimeModel
import com.minhacirurgia.minhacirurgiaws.service.SurgeryTimeService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("surgery-time")
class SurgeryTimeController (
    private val surgeryTimeService: SurgeryTimeService
){
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid surgeryTime: PostSurgeryTimeRequest): String{
       return surgeryTimeService.create(surgeryTime.toSurgeryModel())
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun getSurgeryTime(@RequestParam userId: Int): SurgeryTimeModel?{
        return surgeryTimeService.findSurgeryTime(userId)
    }
}

