package com.example.demo.creational.factory;

public class DieselCar implements Car {
    @Override
    public void fuel() {
        System.out.println("Fueling petrol car with diesel. Glug glug glug...");
    }
}
