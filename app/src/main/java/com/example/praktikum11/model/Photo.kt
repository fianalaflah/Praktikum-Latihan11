package com.example.praktikum11.model

import com.google.gson.annotations.SerializedName


data class Photo(

        @SerializedName("id")
        val id: Int?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("thumbnailurl")
        val thumbnail:String?,
        @SerializedName("url")
        val body: String?
)