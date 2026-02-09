package com.example.demo.creational.factory;

public class ElectricCar implements Car {
    @Override
    public void fuel() {
        System.out.println("Charging electric car. Bzzzz...");
    }
}

