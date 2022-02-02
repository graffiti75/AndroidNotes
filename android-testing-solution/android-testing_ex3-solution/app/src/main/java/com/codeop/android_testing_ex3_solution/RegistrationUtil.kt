package com.codeop.android_testing_ex3_solution

object RegistrationUtil {

    private val existingUsers = listOf("John", "Matthew")

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
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}