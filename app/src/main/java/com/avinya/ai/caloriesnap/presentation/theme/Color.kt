package com.avinya.ai.caloriesnap.presentation.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

val CustomLightColors = lightColorScheme(
    primary = Color(0xFF1cca59),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFa7f9c1),
    onPrimaryContainer = Color(0xFF003913),

    secondary = Color(0xFF4CAF50),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFc8f7d0),
    onSecondaryContainer = Color(0xFF00412b),

    background = Color(0xFFFDFDFD),
    onBackground = Color(0xFF1F1F1F),

    surface = Color(0xFFFFFFFF),
    onSurface = Color(0xFF1F1F1F),

    error = Color(0xFFB00020),
    onError = Color(0xFFFFFFFF)
)

val CustomDarkColors = darkColorScheme(
    primary = Color(0xFF1cca59),
    onPrimary = Color(0xFF003913),
    primaryContainer = Color(0xFF005a24),
    onPrimaryContainer = Color(0xFFa7f9c1),

    secondary = Color(0xFF4CAF50),
    onSecondary = Color(0xFF00412b),
    secondaryContainer = Color(0xFF005a24),
    onSecondaryContainer = Color(0xFFc8f7d0),

    background = Color(0xFF121212),
    onBackground = Color(0xFFF5F5F5),

    surface = Color(0xFF1F1F1F),
    onSurface = Color(0xFFF5F5F5),

    error = Color(0xFFCF6679),
    onError = Color(0xFF1F1F1F)
)