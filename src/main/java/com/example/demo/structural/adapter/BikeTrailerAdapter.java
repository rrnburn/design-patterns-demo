package com.example.demo.structural.adapter;

public class BikeTrailerAdapter extends Car {
    Bike bike;

    public BikeTrailerAdapter(Bike bike) {
        this.bike = bike;
    }

    @Override
    public boolean getTowBar() {
        return true;
    }
}
