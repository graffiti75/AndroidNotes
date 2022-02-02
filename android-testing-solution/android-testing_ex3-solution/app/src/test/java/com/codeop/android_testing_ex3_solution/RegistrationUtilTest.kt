package com.codeop.android_testing_ex3_solution

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun givenEmptyUsername_thenReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun givenValidUsername_whenCorrectlyRepeatedPassword_thenReturnsTrue() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Josh",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun givenUsernameAlreadyExisting_thenReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "John",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun givenIncorrectlyConfirmedPassword_thenReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Matthew",
            "123456",
            "abcdefg"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun givenEmptyPassword_thenReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Matthew",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun givenLessThanTwoDigitPassword_thenReturnsFalse() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Matthew",
            "abcdefg5",
            "abcdefg5"
        )
        assertThat(result).isFalse()
    }
}