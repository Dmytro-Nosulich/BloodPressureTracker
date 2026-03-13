package com.example.bloodpressuretracker

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform