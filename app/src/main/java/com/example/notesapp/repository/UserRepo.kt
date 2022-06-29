package com.example.notesapp.repository

import android.util.Log
import com.example.notesapp.api.UserApi
import com.example.notesapp.models.UserRequest
import com.example.notesapp.models.UserResponse
import com.example.notesapp.utils.Constant.TAG
import javax.inject.Inject

class UserRepo @Inject constructor(private val userApi: UserApi){

    suspend fun registerUser(userRequest: UserRequest){
      val response=  userApi.signup(userRequest)
        Log.d(TAG, "getResponseFromApi: "+response.body().toString())
    }

    suspend fun loginUser(userRequest: UserRequest){
        val response=  userApi.signin(userRequest)
        Log.d(TAG, "getResponseFromApi: "+response.body().toString())
    }
}