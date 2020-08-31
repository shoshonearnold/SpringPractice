package com.shoshonearnold.SpringPractice1.ContextControllers;

import com.shoshonearnold.SpringPractice1.Services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public GreetingService getGreeting() {
        return greetingService;
    }
}
