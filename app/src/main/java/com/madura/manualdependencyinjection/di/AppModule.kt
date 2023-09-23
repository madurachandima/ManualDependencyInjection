package com.madura.manualdependencyinjection.di

import android.content.Context
import com.madura.manualdependencyinjection.data.AuthApi
import com.madura.manualdependencyinjection.data.AuthRepositoryImpl
import com.madura.manualdependencyinjection.domain.AuthRepository
import retrofit2.Retrofit
import retrofit2.create


interface AppModule {
    val authApi: AuthApi
    val authRepository: AuthRepository
}

class AppModuleImpl(private val appContext: Context) : AppModule {
    override val authApi: AuthApi by lazy {
        Retrofit.Builder()
            .baseUrl("")
            .build()
            .create()
    }
    override val authRepository: AuthRepository by lazy {
        AuthRepositoryImpl(authApi)
    }
}