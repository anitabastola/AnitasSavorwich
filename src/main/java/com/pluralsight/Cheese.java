package com.pluralsight;

public class Cheese extends PremiumTopping {
    public Cheese(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {
        double price = 0;
        switch (size) {
            case "4'":
                return price + 0.30;
            case "8'":
                return price + 0.60;
            case "12'":
                return price + 0.90;
        }
        return price;
    }
}
