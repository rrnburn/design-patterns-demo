package com.example.demo.creational.prototype;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder
public abstract class CarPrototype {
    String model;
    String color;

    public CarPrototype(CarPrototype car) {
        this.model = car.model;
        this.color = car.color;
    }

    public abstract CarPrototype clone();
}
