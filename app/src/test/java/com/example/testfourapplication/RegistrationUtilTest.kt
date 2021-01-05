package com.example.testfourapplication

import org.hamcrest.core.IsEqual.equalTo
import org.junit.Assert.*
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "password",
            "123"
        )
        assertEquals(result, false)
    }

    @Test
    fun `valid username and password return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Nutchanok",
            "password123",
            "password123"
        )
        assertEquals(result, true)
    }

    @Test
    fun `username already exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "password",
            "password"
        )
        assertEquals(result, false)
    }
    @Test
    fun `less than 2 digit return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "password",
            "password"
        )
        assertEquals(result, false)
    }


}