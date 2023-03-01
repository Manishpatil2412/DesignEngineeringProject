package com.bhaskar.designengineeringproject.model

data class Feedback(
    var feedbackId: String = "",
    var userId: String = "",
    var feedbackType: String = "",
    var feedbackDescription: String = "",
    var feedbackDate: String = "",
    var feedbackDateTime: String = "",
)
