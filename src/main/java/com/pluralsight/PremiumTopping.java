package com.pluralsight;

public abstract class  PremiumTopping implements Topping {
    private String name;
    private double price;

    public PremiumTopping(String name, double price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract double getPrice(String size);
}
