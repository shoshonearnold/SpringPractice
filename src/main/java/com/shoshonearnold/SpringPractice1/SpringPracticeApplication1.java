package com.shoshonearnold.SpringPractice1;

import com.shoshonearnold.SpringPractice1.ContextControllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringPracticeApplication1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringPracticeApplication1.class, args);

        MyController myController = (MyController)ctx.getBean("myController");

        String greeting = myController.sayHello();
        System.out.println(greeting);
    }
}
