package com.madura.manualdependencyinjection.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.madura.manualdependencyinjection.presentation.MainViewModel
import com.madura.manualdependencyinjection.presentation.viewModelFactory
import com.madura.manualdependencyinjection.ui.theme.ManualDependencyInjectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ManualDependencyInjectionTheme {
                val viewModel = viewModel<MainViewModel>(
                    factory = viewModelFactory {
                        MainViewModel(MyApp.appModule.authRepository)
                    }
                )
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Button(onClick = {
                        viewModel.login()
                    }) {
                        Text(text = "Login")
                    }
                }
            }
        }
    }
}

