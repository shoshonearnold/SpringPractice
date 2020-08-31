package com.shoshonearnold.SpringPractice1.ContextControllers;

import com.shoshonearnold.SpringPractice1.Services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();

    }

    @Test
    void getSayHello() {
        System.out.println(controller.getGreeting());
    }
}