package com.vegahar.test

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    @RequestMapping("/greeting")
    fun greeting(): String {
        return "yello"
    }
}

