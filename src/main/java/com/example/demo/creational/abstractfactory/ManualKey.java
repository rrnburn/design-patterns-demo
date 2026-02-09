package com.example.demo.creational.abstractfactory;

public class ManualKey implements Key {
    @Override
    public void open() {
        System.out.println("Opening car with manual key");
    }
}
