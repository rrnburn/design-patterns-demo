package com.example.demo.creational.abstractfactory;

public class NewCarFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new NewCar();
    }

    @Override
    public Key findKey() {
        return new WirelessKey();
    }
}
