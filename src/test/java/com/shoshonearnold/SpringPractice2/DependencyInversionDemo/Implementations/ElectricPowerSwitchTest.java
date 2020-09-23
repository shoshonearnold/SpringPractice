package com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Implementations;

import com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Interfaces.Switch;
import com.shoshonearnold.SpringPractice2.DependencyInversionDemo.Interfaces.Switchable;
import org.junit.jupiter.api.Test;

class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable switchable = new LightBulb();
        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchable);
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();

        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}