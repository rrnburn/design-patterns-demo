package com.example.demo.creational.abstractfactory;

public class WirelessKey implements Key {
    @Override
    public void open() {
        System.out.println("Opening car with wireless key");
    }
}
