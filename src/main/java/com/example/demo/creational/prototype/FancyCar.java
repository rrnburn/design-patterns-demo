package com.example.demo.creational.prototype;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@SuperBuilder
public class FancyCar extends CarPrototype {
    private final int horsePower;

    public FancyCar(FancyCar fancyCar) {
        super(fancyCar);
        this.horsePower = fancyCar.horsePower;
    }

    @Override
    public CarPrototype clone() {
        System.out.println("Cloning FancyCar: " + this);
        return new FancyCar(this);
    }
}
