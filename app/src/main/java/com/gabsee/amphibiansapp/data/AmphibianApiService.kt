package com.gabsee.amphibiansapp.data

import retrofit2.http.GET

interface AmphibianApiService {
    @GET("amphibians")
    suspend fun getData(): List<Amphibian>
}