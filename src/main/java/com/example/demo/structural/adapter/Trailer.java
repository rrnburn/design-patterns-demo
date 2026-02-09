package com.example.demo.structural.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Trailer {
    int length;

    public boolean attachesTo(Car car) {
        return car.getTowBar();
    }
}
