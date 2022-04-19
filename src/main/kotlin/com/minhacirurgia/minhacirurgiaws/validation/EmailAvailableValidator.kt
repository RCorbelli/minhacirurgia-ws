package com.minhacirurgia.minhacirurgiaws.validation

import com.minhacirurgia.minhacirurgiaws.service.UserService
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class EmailAvailableValidator(var userService: UserService): ConstraintValidator<EmailAvailable, String> {
    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        if(value.isNullOrEmpty()){
            return false
        }
        return userService.emailAvailable(value)
    }
}
