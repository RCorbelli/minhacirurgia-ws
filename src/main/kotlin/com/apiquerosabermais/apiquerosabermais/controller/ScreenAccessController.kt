package com.apiquerosabermais.apiquerosabermais.controller

import com.apiquerosabermais.apiquerosabermais.controller.request.PostUserRequest
import com.apiquerosabermais.apiquerosabermais.model.ScreenAccessModel
import com.apiquerosabermais.apiquerosabermais.service.ScreenAccessService
import com.apiquerosabermais.apiquerosabermais.service.UserService
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

