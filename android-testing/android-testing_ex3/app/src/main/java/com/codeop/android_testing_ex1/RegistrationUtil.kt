package com.codeop.android_testing_ex3

object RegistrationUtil {

    private val existingUsers = listOf("Jack", "Matthew")

    /**
     * The input is not valid if:
     * 1) The username/password is empty
     * 2) The username is already taken
     * 3) The confirmed password is not the same as the real password
     * 4) The password contains less than 2 digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        // TODO
        return true
    }
}