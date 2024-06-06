package com.pluralsight;

public abstract class  PremiumTopping implements Topping {
    private String name;

    public PremiumTopping(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract double getPrice(String size);
}
