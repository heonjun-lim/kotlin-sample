package com.yanoljafnb.kotlinsample.service

import com.yanoljafnb.kotlinsample.domain.SampleRepository
import org.springframework.stereotype.Service

@Service
class SampleService(
    private val sampleRepository: SampleRepository,
) {
    fun hello3(): String {
        return "Hello World 3"
    }

    fun hello4(): String? {
        val randomValue = (0..1).random()
        if (randomValue == 0) {
            return "Hello World 4"
        }
        return null
    }

    fun hello5(): String? = sampleRepository.findAll().firstOrNull()?.name
}
