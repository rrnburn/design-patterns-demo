package com.example.demo.creational.abstractfactory;

public class NewCar implements Car {
    @Override
    public void drive() {
        System.out.println("Driving a new car");
    }
}
