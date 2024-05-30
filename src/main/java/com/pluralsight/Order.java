package com.pluralsight;

import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;
    private Customer customer;

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips, Customer customer) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
        this.customer = customer;


    }
}
