package dev.yogesh.multiplatformapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform