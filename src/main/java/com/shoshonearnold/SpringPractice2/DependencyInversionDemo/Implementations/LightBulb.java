package com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Implementations;

import com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Interfaces.Switchable;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Bulb on");
    }

    @Override
    public void turnOff() {
        System.out.println("Bulb off");
    }
}
