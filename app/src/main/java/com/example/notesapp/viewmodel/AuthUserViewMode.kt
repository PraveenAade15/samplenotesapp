package com.example.notesapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notesapp.models.UserRequest
import com.example.notesapp.repository.UserRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthUserViewMode @Inject constructor(private val userRepo: UserRepo):ViewModel() {


    fun registerUser(userRequest: UserRequest){
        viewModelScope.launch {
            userRepo.registerUser(userRequest)
        }
    }
    fun loginUser(userRequest: UserRequest){
        viewModelScope.launch {
            userRepo.loginUser(userRequest)
        }
    }
}