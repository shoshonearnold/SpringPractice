package com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo;

import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Implemtations.ToyCar;
import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Implemtations.ToyHouse;
import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Implemtations.ToyPlane;
import org.junit.jupiter.api.Test;

class ToyBuilderTest {

    @Test
    void buildToyHouse() throws Exception {
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }

    @Test
    void buildToyCar() {
        ToyCar toyCar = ToyBuilder.buildToyCar();
        System.out.println(toyCar);
    }

    @Test
    void buildToyPlane() {
        ToyPlane toyPlane = ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }
}