package com.bhaskar.designengineeringproject.model

data class Complain(
    var userId: String = "",
    var userEmail: String = "",
    var complainTitle: String = "",
    var poleNumber: String = "",
    var address: String = "",
    var complainId: String = "",
    var complainType: String = "",
    var complainDescription: String = "",
    var complainImage: String = "",
    var complainLocation: String = "",
    var complainDate: String = "",
    var complainDateTime: String = "",
)
