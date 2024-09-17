package com.martins.milton.tripaddict

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Trip Addict",
    ) {
        App()
    }
}