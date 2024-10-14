package com.avinya.ai.caloriesnap.presentation.splash

sealed class SplashEffect {
    data object NavigateToHome : SplashEffect()
    data object NavigateToAuthentication : SplashEffect()
}