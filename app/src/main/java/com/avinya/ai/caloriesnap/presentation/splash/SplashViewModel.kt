package com.avinya.ai.caloriesnap.presentation.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.avinya.ai.caloriesnap.domain.usecase.IsAuthenticatedUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val isAuthenticatedUsecase: IsAuthenticatedUsecase
) : ViewModel() {

    private val _uiEffect = MutableSharedFlow<SplashEffect>()
    val uiEffect: SharedFlow<SplashEffect> = _uiEffect

    init {
        checkIfAuthenticated()
    }

    private fun checkIfAuthenticated() {
        viewModelScope.launch(Dispatchers.IO) {
            isAuthenticatedUsecase.invoke()?.let { isAuthenticated ->
                if (isAuthenticated) {
                    _uiEffect.emit(SplashEffect.NavigateToHome)
                } else {
                    _uiEffect.emit(SplashEffect.NavigateToAuthentication)
                }
            } ?: run {
                _uiEffect.emit(SplashEffect.NavigateToAuthentication)
            }
        }
    }
}