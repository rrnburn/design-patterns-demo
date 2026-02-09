package com.example.demo.creational.factory;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuelStationFactory {

    public Car recogniseCar() {
        String vehicle = identifyCar();
        return switch (vehicle.toLowerCase()) {
            case "petrol" -> new PetrolCar();
            case "diesel" -> new DieselCar();
            case "electric" -> new ElectricCar();
            default -> throw new IllegalArgumentException("Unknown car type: " + vehicle);
        };
    }

    private static String identifyCar() {
        return List.of("diesel", "petrol", "electric").get((int) (Math.random() * 3));
    }
}
