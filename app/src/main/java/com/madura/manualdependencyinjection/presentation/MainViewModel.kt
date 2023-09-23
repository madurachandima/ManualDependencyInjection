package com.madura.manualdependencyinjection.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.madura.manualdependencyinjection.domain.AuthRepository
import kotlinx.coroutines.launch

class MainViewModel(

    private val authRepository: AuthRepository
) : ViewModel() {

    fun login() {
        viewModelScope.launch {
            authRepository.login("test@gmail.com", "test123")
        }
    }
}