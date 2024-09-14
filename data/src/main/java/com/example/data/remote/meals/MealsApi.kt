package com.example.data.remote.meals

import com.example.domain.entity.meals.mealsmodelresponse
import retrofit2.http.GET

interface MealsApi {

    @GET("api/json/v1/1/categories.php")
    suspend fun getMealsRequest(): mealsmodelresponse

}