package com.pluralsight;

import java.util.List;

public class Sandwich {


    private String size;
    private String typeofBread;
    private boolean isToasted;
    private List<Topping> toppings;


    public Sandwich(String size, String typeofBread, boolean isToasted, List<Topping> toppings) {
        this.size = size;
        this.typeofBread = typeofBread;
        this.isToasted = isToasted;
        this.toppings = toppings;
    }

}
