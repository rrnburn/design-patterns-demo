package com.example.demo;

import com.example.demo.creational.Singleton;
import com.example.demo.creational.abstractfactory.CarAuctionProcessor;
import com.example.demo.creational.factory.FuelStationFactory;
import com.example.demo.creational.factory.FuelStationService;
import com.example.demo.creational.prototype.CarPrototype;
import com.example.demo.creational.prototype.FancyCar;
import com.example.demo.structural.adapter.Bike;
import com.example.demo.structural.adapter.BikeTrailerAdapter;
import com.example.demo.structural.adapter.Car;
import com.example.demo.structural.adapter.Trailer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("--- Factory Example ---");
		for (int i = 0; i < 5; i++) {
			runFactoryMethodExample();
		}
		System.out.println("--- Abstract Factory Example ---");
		for (int i = 0; i < 5; i++) {
			runAbstractFactoryMethodExample();
		}
		System.out.println("--- Prototype Example ---");
		runPrototypeExample();

		System.out.println("--- Singleton Example ---");
		runSingletonExample();

		System.out.println("--- Adapter Example ---");
		runAdapterExample();
	}
	// The factory method pattern is used to create objects without specifying the exact class of object that will be created.
	// Here we will get a random car type at a fuel station and fuel it accordingly.
	private static void runFactoryMethodExample() {
		FuelStationService station = new FuelStationService(new FuelStationFactory());
		station.fuelCar();
	}

	// The abstract factory pattern is used to create families of related or dependent objects without specifying their concrete classes.
	// Here we will simulate retrieving a car from an auction lot, getting the car and its key, and then using them.
	private static void runAbstractFactoryMethodExample() {
		var retrieved = CarAuctionProcessor.retrieveNextFromLot();
		var car = retrieved.getCar();
		var key = retrieved.findKey();
		key.open();
		car.drive();
	}

	// The prototype pattern is used to create new objects by copying an existing object, known as the prototype.
	// Here we will create a fancy car and then clone it, ensuring that the cloned object is a separate instance.
	private static void runPrototypeExample() {
		List<CarPrototype> cars = new ArrayList<>();

        var carOne = FancyCar.builder()
				.model("Focus")
				.color("Blue")
				.horsePower(122)
				.build();
		cars.add(carOne);

		var carTwo = FancyCar.builder()
				.model("Mondeo")
				.color("Silver")
				.horsePower(700)
				.build();
		cars.add(carTwo);

        List<CarPrototype> clonedCars = new ArrayList<>(List.of(carOne.clone(), carTwo.clone()));

		for (int i = 0; i < cars.size(); i++) {
			var car = cars.get(i);
			var clonedCar = clonedCars.get(i);
			if (!clonedCar.equals(car)) {
				System.out.println("Car objects are not same! car:" + car + " clonedCar:" + clonedCar);
			}
		}
	}

	// The singleton pattern is used to ensure that a class has only one instance and provides a global point of access to it.
	// Here we will attempt to create two instances of a singleton class and demonstrate that they are the same instance even after supplying different values.
	private static void runSingletonExample() {
		var singleton1 = Singleton.getInstance("First Instance");
		var singleton2 = Singleton.getInstance("Second Instance");

		System.out.println(singleton1.value);
		System.out.println(singleton2.value);
		System.out.println(singleton1 == singleton2);
	}

	private static void runAdapterExample() {
		var car = new Car(true);
		var trailer = new Trailer(5);
		System.out.println("Can trailer attach to car? " + trailer.attachesTo(car));

		var bike = new Bike(100);
		var bikeTrailerAdapter = new BikeTrailerAdapter(bike);
		System.out.println("Can trailer attach to bike with adapter? " + trailer.attachesTo(bikeTrailerAdapter));
	}

}
