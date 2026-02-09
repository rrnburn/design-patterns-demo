package com.example.demo.creational.abstractfactory;

public class OldCarFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new OldCar();
    }

    @Override
    public Key findKey() {
        return new ManualKey();
    }
}
