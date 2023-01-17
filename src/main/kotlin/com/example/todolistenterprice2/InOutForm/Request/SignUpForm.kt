package com.example.todolistenterprice2.InOutForm.Request

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class SignUpForm(
    @NotBlank
    @Size(min = 3, max = 60)
    val name: String? = null,
    @NotBlank
    @Size(min = 6, max = 60)
    val password: String? = null,
    @NotBlank
    @Size(max = 60)
    @Email
    var email: String? = null,
    var role: Set<String>? = null,
    @NotBlank
    @Size(min = 3, max = 50)
    var username: String? = null
) {
}