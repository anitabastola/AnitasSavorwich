package com.pluralsight;

public class Drink {
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        double price = 0;

        switch(size.toLowerCase()) {
            case "small":
                price = 1.00;
                break;
            case "medium":
                price = 2.00;
                break;
            case "large":
                price = 3.00;
                break;
            default:
                System.out.println("invalid size");
                break;

        }
        return price;
    }

    }

