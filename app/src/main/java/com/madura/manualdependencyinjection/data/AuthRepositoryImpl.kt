package com.madura.manualdependencyinjection.data

import com.madura.manualdependencyinjection.domain.AuthRepository
import java.lang.Exception

class AuthRepositoryImpl(
    private val api: AuthApi
) : AuthRepository {
    override suspend fun login(email: String, password: String) {
        try {
            println("Logging in...")
         //   api.login()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}