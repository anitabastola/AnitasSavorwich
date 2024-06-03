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

    public void addSandwich() {
        sandwiches.add(sandwich);
    }

    public void addDrink() {
        drinks.add(drink);
    }

    public void addChip() {
        chips.add(chip);
    }



    public double totalPrice() {
        double total = 0;
        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getPrice();
        }
        for (Drink drink : drinks) {
            total += drink.getPrice();
        }
        for (Chips chip : chips) {
            total += chip.getPrice();
        }
        return total;
    }
}
