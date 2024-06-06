package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private String size;
    private String typeofBread;
    private boolean isToasted;
    private List<Topping> toppings;


    public Sandwich(String size, String typeofBread) {
        this.size = size;
        this.typeofBread = typeofBread;
        this.isToasted = false;
        this.toppings = new ArrayList<>(toppings);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTypeofBread() {
        return typeofBread;
    }

    public void setTypeofBread(String typeofBread) {
        this.typeofBread = typeofBread;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }




    public double getPrice() {
        double totalPrice = getPrice();
        for (Topping topping : toppings) {
            totalPrice += topping.getPrice(size);
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        String toReturn = getTypeofBread() + "sandwich";
                return "Size: " + size +"\n"
                        +"Bread: " + typeofBread + "\n"
                        +"Toppings: " + toppings + "\n"
                        +"Toasted: " + (isToasted ? "yes" : "no");

        }

    }

