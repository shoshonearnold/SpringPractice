package com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Implemtations;

import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Interfaces.Flyable;
import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Interfaces.Movable;
import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Interfaces.Toy;

public class ToyPlane implements Toy, Movable, Flyable {
    double price;
    String color;

    @Override
    public void fly() {
        System.out.println("this toy can fly!");
    }

    @Override
    public void move() {
        System.out.println("This toy can move!");
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }


}
