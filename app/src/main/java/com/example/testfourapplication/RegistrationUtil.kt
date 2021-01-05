package com.example.testfourapplication

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isNullOrEmpty() || password.isNullOrEmpty()) {
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