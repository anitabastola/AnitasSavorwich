package com.pluralsight;

public class Regular implements Topping {
    private  String name;

    public Regular(String name, double price) {
        this.name = name;
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
