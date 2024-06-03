package com.pluralsight;

public class Sauce implements Topping {
    private String name;

    public Sauce(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }
}
