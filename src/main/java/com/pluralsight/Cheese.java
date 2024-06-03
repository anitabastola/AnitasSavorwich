package com.pluralsight;

public class Cheese extends PremiumTopping {
    public Cheese(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice(String size) {
        double price = 0;
        switch (size) {
            case "small":
                return price + 0.30;
            case "medium":
                return price + 0.60;
            case "large":
                return price + 0.90;
        }
        return price;
    }
}
