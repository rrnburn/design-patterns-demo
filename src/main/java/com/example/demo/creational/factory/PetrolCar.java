package com.example.demo.creational.factory;

public class PetrolCar implements Car {
    @Override
    public void fuel() {
        System.out.println("Fueling petrol car with petrol. Glug glug glug...");
    }
}
