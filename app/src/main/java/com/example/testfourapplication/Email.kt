package com.example.testfourapplication

interface Email {
    var getEmailBody: String
    var getSender: String
    var getAttachedFiles: MutableList<String>
}