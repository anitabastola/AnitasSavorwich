package com.pluralsight;

public class Regular implements Topping {
    private  String name;
    private double price;

    public Regular(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public  double getPrice(String size) {
        return 0;
    }
}
