package com.shoshonearnold.SpringPractice1;

import com.shoshonearnold.SpringPractice1.ContextControllers.ConstructorInjectedController;
import com.shoshonearnold.SpringPractice1.ContextControllers.MyController;
import com.shoshonearnold.SpringPractice1.ContextControllers.PropertyInjectedController;
import com.shoshonearnold.SpringPractice1.ContextControllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
// Refer to GreetingService -> GreetingServiceImpl -> Any Controller for context
@SpringBootApplication
public class SpringPracticeApplication1 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringPracticeApplication1.class, args);

        MyController myController = (MyController)ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);

        PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
        String propGreeting = propertyInjectedController.getGreeting();
        System.out.println(propGreeting);

        ConstructorInjectedController constructorInjectedController  = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
        String consGreeting = constructorInjectedController.getGreeting();
        System.out.println(consGreeting);

        SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
        String setterGreeting = setterInjectedController.getGreeting();
        System.out.println(setterGreeting);

    }
}
