package com.martins.milton.tripaddict

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform