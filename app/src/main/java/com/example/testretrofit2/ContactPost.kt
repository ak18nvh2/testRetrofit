package com.example.testretrofit2

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName




class ContactPost {
    @SerializedName("Email")
    @Expose
    var email: String? = null

    @SerializedName("custom")
    @Expose
    var custom: Custom? = null

    @SerializedName("LastName")
    @Expose
    var lastName: String? = null

    @SerializedName("FirstName")
    @Expose
    var firstName: String? = null
}