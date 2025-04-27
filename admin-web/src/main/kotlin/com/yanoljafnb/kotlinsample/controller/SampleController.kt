package com.yanoljafnb.kotlinsample.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Controller
class SampleController {
    @GetMapping("/hello")
    fun hello(model: Model): String {
        val now = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        model.addAttribute("time", now.format(formatter))
        return "hello"
    }
}
