package com.vegahar.test

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@SpringBootApplication
@EnableWebSecurity
class TestApplication

fun main(args: Array<String>) {
    runApplication<TestApplication>(*args)
}