package com.example.api.services

import com.example.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.http.GET

interface MediumAPI {
    @GET("articles")
    fun getArticles() : Call<ArticlesResponse>
}