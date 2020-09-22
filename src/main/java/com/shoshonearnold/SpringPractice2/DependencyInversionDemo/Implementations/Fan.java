package com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Implementations;

import com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Interfaces.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan moving");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan stopped");
    }
}
