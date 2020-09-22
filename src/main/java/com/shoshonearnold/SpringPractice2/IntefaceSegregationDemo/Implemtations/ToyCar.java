package com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Implemtations;

import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Interfaces.Movable;
import com.shoshonearnold.SpringPractice2.IntefaceSegregationDemo.Interfaces.Toy;

public class ToyCar implements Toy,Movable {
    double price;
    String color;

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
