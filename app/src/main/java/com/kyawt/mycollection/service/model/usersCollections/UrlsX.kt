package com.kyawt.mycollection.service.model.usersCollections


import com.google.gson.annotations.SerializedName

data class UrlsX(
    @SerializedName("full")
    val full: String,
    @SerializedName("raw")
    val raw: String,
    @SerializedName("regular")
    val regular: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("thumb")
    val thumb: String
)