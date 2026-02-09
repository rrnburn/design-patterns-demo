package com.example.demo.creational.abstractfactory;

import org.springframework.stereotype.Service;

@Service
public class CarAuctionProcessor {
    public static CarFactory retrieveNextFromLot() {
        System.out.println("Car pulling up to the lot, organising key for car...");
        if (Math.random() < 0.5) {
            return new NewCarFactory();
        } else {
            return new OldCarFactory();
        }
    }
}
