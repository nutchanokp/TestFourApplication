package com.example.testfourapplication

import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito

class EmailTest {

    @Test
    fun testSendingEmailReturnEmailBody() {
        var emailClient :EmailClient = EmailClient()
        val emailInterface: Email = Mockito.mock(Email::class.java)

        emailClient.sendEmail(emailInterface)
        Mockito.`when`(emailInterface.getEmailBody).thenReturn("I had a great time last night!")
        val body: String = emailInterface.getEmailBody
        Assert.assertEquals("I had a great time last night!", body)

    }
}