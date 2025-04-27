package com.yanoljafnb.kotlinsample.controller

import com.yanoljafnb.kotlinsample.service.SampleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(
    private val sampleService: SampleService,
) {
    @GetMapping("/sample1")
    fun hello1() = "Hello World 1"

    @GetMapping("/sample2")
    fun hello2(): String {
        return "hello World 2"
    }

    @GetMapping("/sample3")
    fun hello3(): String {
        return sampleService.hello3()
    }

    @GetMapping("/sample4")
    fun hello4(): String? {
        return sampleService.hello4()
    }

    @GetMapping("/sample5")
    fun hello5(): String? = sampleService.hello5()
}
