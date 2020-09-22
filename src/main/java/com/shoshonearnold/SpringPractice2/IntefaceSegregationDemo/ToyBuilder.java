package com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo;

import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Implemtations.ToyCar;
import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Implemtations.ToyHouse;
import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Implemtations.ToyPlane;
import org.springframework.stereotype.Component;

@Component
public class ToyBuilder {
    public static ToyHouse buildToyHouse() {
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(10.00);
        toyHouse.setColor("Red");
        return toyHouse;
    }

    public static ToyCar buildToyCar() {
        ToyCar toyCar = new ToyCar();
        toyCar.setPrice(11.00);
        toyCar.setColor("Blue");
        toyCar.move();
        return toyCar;
    }

    public static ToyPlane buildToyPlane() {
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(20.00);
        toyPlane.setColor("Black");
        toyPlane.move();
        toyPlane.fly();
        return toyPlane;
    }
}
