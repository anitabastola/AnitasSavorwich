package com.pluralsight;

public class Meat extends PremiumTopping {
    private boolean extraMeat;
    public Meat(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice(String size) {
        double price = 0;
        switch (size) {
            case "small":
                price = 1.0;
                if (extraMeat) {
                    price += 0.50;
                }
                break;
            case "medium":
                price = 2.0;
                if(extraMeat) {
                    price += 1.00;
                }
                break;
            case "large":
                price = 3.0;
                if(extraMeat) {
                    price += 1.50;
                }
                break;
        }
        return price;
    }
}