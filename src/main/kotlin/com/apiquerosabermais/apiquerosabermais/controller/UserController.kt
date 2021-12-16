package com.apiquerosabermais.apiquerosabermais.controller

import com.apiquerosabermais.apiquerosabermais.controller.request.PostUserRequest
import com.apiquerosabermais.apiquerosabermais.model.UserModel
import com.apiquerosabermais.apiquerosabermais.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid



@RestController
@RequestMapping("users")
class UserController (
    private val userService: UserService,
)
{

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody @Valid user: PostUserRequest){
        userService.create(user.toUserModel())
    }



    @PostMapping("/login")
    @ResponseStatus(HttpStatus.CREATED)
    fun login(@RequestBody userLogin: UserModel.UserLogin): UserModel {
        return userService.login(userLogin)
    }

}

