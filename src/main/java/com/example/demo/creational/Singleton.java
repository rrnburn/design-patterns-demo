package com.example.demo.creational;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Singleton {
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
        instance = this;
    }

    public static Singleton getInstance(String value) {
        if (instance != null) {
            return instance;
        } else {
            synchronized (Singleton.class) {
                return new Singleton(value);
            }
        }
    }
}
