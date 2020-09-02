package com.shoshonearnold.SpringPractice1.Services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Property";
    }
}
