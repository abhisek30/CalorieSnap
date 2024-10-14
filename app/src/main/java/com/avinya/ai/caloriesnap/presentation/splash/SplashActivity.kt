package com.avinya.ai.caloriesnap.presentation.splash

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.runtime.LaunchedEffect
import com.avinya.ai.caloriesnap.presentation.authentication.AuthenticationActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach


@AndroidEntryPoint
class SplashActivity : ComponentActivity() {
    private val viewModel by viewModels<SplashViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LaunchedEffect(Unit) {
                viewModel.uiEffect.onEach { mainEffect ->
                    when (mainEffect) {
                        is SplashEffect.NavigateToHome -> {

                        }

                        is SplashEffect.NavigateToAuthentication -> {
                            startActivity(
                                Intent(
                                    this@SplashActivity,
                                    AuthenticationActivity::class.java
                                )
                            )
                            finish()
                        }
                    }
                }.collect()
            }
        }
    }
}
