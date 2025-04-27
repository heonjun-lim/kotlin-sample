package com.yanoljafnb.kotlinsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSampleWebApplication

fun main(args: Array<String>) {
    runApplication<KotlinSampleWebApplication>(*args)
}
