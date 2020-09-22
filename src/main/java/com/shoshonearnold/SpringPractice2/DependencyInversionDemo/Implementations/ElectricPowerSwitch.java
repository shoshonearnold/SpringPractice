package com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Implementations;

import com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Interfaces.Switch;
import com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Interfaces.Switchable;

public class ElectricPowerSwitch implements Switch {
    public Switchable client;
    public boolean on = false;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    public void press() {
        boolean checkOn = isOn();
        if(checkOn) {
            client.turnOff();
            on = false;
        } else {
            client.turnOn();
            on = true;
        }
    }
}
