package com.madura.manualdependencyinjection.domain

interface AuthRepository {
    suspend fun login(email: String, password: String)
}