package com.shoshonearnold.SpringPractice1.ContextControllers;

import com.shoshonearnold.SpringPractice1.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();

    }
}
