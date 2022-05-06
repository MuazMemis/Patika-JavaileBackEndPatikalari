package com.muazmemis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    // http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")
//    @ResponseBody // Bu anotation olmazsa 500 hatası verir.
    public String getThymeleaf1() {
        return "thymeleaf1";
    }
}
