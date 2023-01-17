package com.example.todolistenterprice2.InOutForm.Request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class SignInForm(
    @NotBlank
    @Size(min = 3, max = 60)
    val name:String?=null,
    @NotBlank
    @Size(min = 6, max = 60)
    val password:String?=null
) {
}