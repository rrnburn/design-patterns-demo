package com.example.demo.creational.factory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FuelStationService {

    private final FuelStationFactory fuelStationFactory;

    // Client code, does not depend on concrete car implementations
    // All it knows is how to use the Car interface and will fuel correctly
    public void fuelCar() {
        System.out.println("--- New car arrived at the fuel station ---");
        var car = fuelStationFactory.recogniseCar();
        car.fuel();
        System.out.println("--- Car has been fueled and is leaving the station ---\n");
    }
}
