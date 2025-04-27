package com.yanoljafnb.kotlinsample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["com.yanoljafnb.kotlinsample.*"])
class KotlinSampleApiApplication

fun main(args: Array<String>) {
    runApplication<KotlinSampleApiApplication>(*args)
}
