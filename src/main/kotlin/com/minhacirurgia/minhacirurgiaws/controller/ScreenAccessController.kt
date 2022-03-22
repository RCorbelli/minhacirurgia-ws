package com.minhacirurgia.minhacirurgiaws.controller

import com.minhacirurgia.minhacirurgiaws.controller.request.PostUserRequest
import com.minhacirurgia.minhacirurgiaws.model.ScreenAccessModel
import com.minhacirurgia.minhacirurgiaws.service.ScreenAccessService
import com.minhacirurgia.minhacirurgiaws.service.UserService
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("screens")
class ScreenAccessController (
    private val screenAccessService: ScreenAccessService
){
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid screenAccess: ScreenAccessModel){
        screenAccessService.create(screenAccess)
    }

    @GetMapping("/{userId}")
    fun findById(@PathVariable userId: Int): List<ScreenAccessModel>{
        return screenAccessService.findAllByUserId(userId)
    }
}

