package com.shoshonearnold.SpringPractice1.ContextControllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        return "Hello";
    }
}
