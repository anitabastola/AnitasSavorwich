package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class HomeScreen {
    private static Scanner scanner = new Scanner(System.in);
    private static Order currentOrder;
    public static void main(String[] args) {
        displayHomeScreen();
    }
    public static void displayHomeScreen() {
        currentOrder = new Order(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new Customer("Default Customer", "Default Order"));
        while (true) {
            System.out.println("WELCOME TO ANITASSAVORWICH!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.println("Choose option");
            int choice = scanner.nextInt();

            scanner.nextLine();
            switch (choice) {
                case 1:
                    startNewOrder();
                    break;
                case 0:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice, try again");
            }
        }
    }

    public static void startNewOrder() {

        while (true) {
            System.out.println("1. Add sandwich");
            System.out.println("2. Add Drink");
            System.out.println("3. Add Chips");
            System.out.println("4. Checkout");
            System.out.println("0. Cancel Order");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAddSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChip();
                    break;
                case 4:
                    checkout();
                    break;
                case 0:
                    System.out.println("Cancel Order");
                    return;
                default:
                    System.out.println("Invalid, please try again");
            }
        }
    }

    public static void displayAddSandwich() {
        System.out.println("Bread options: White, Wheat, Rye, Wrap");
        System.out.println("Enter the name of bread");
        String bread = scanner.nextLine();

        System.out.println("Sandwich sizes (4', 8', or 12'");
        System.out.println("Please enter sandwich size: ");
        String sandwichSize = scanner.nextLine();

        Sandwich newSandwich = new Sandwich(sandwichSize, bread);
        System.out.println("Meat options: Steak, Ham, Salami, Roast Beef, Chicken, Bacon. ");
        System.out.println("Please enter the type of meat: ");
        String meat = scanner.nextLine();

        System.out.println("Would you like extra meat? (yes/no");
        String extraMeat = scanner.nextLine();

        boolean extraMeatBool = Boolean.parseBoolean(extraMeat);
        newSandwich.addTopping(new Meat(meat, extraMeatBool));
        System.out.println("Cheese Option: American, Provolone, Cheddar, Swiss");
        System.out.println("Enter type of cheese");
        String cheese = scanner.nextLine();

        System.out.println("Would you like extra cheese? (yes or no)");
        boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");
        newSandwich.addTopping(new Cheese(cheese));
        System.out.println("Regular Topping options: Lettuce, Peppers, Onioins, Tomatoes, Jalapenos, Cucumbers, Pickles, Guacmole, Mushroom");
        System.out.println("Please enter toppings: ");
        String regularTopping = scanner.nextLine();

        while (!regularTopping.equalsIgnoreCase("exit")) {
            newSandwich.addTopping(new Regular(regularTopping, 0));
            System.out.println("Enter another topping or exit to stop ");
            regularTopping = scanner.nextLine();
        }

        System.out.println("Sauce options: Mayo, Mustard, Ketchup, Ranch, Thousand Islands, Vinaigrette");
        System.out.println("Please enter a sauce");
        String sauce = scanner.nextLine();

        while (!sauce.equalsIgnoreCase("exit")) {
            newSandwich.addTopping(new Sauce(sauce));
            System.out.println("Enter another sauce or exit to stop ");
            sauce = scanner.nextLine();
        }

        System.out.println("Would you like your sandwich to be toasted? (yes or no)");
        String toasted = scanner.nextLine();
        newSandwich.setToasted(Boolean.parseBoolean(toasted));
        currentOrder.addSandwich(newSandwich);
    }

    public static void addDrink() {
        System.out.println("Choose drink option ");
        System.out.println("1. Coca Cola ");
        System.out.println("2. Pepsi");
        System.out.println("3. Sprite");
        System.out.println("4. Fanta");
        System.out.println("5. Water");
        System.out.println("0 Exit");
        int choice= scanner.nextInt();
        scanner.nextLine();

        String drinkSize = "";
        String drinkFlavor = "";

        switch (choice) {
            case 1:
                drinkFlavor = "Coca Cola";
                break;
            case 2:
                drinkFlavor = "Pepsi";
                break;
            case 3:
                drinkFlavor = "Sprite";
                break;
                case 4:
                drinkFlavor = "Fanta";
                break;
            case 5:
                drinkFlavor = "Water";
                break;
            default:
                System.out.println("Invalid choice, try again");
                return;
        }
        System.out.println("Enter drink size (Small, Medium, Large)");
        drinkSize = scanner.nextLine();

        Drink newDrink = new Drink(drinkSize, drinkFlavor);
        currentOrder.addDrink(newDrink);

    }

    public static void addChip() {

        System.out.println("Choose chip option ");
        System.out.println("1.  Doritos ");
        System.out.println("2. Hot Cheetos");
        System.out.println("3. Lays");
        System.out.println("4. Takis");
        System.out.println("5. Ruffles");
        System.out.println("0 Exit");

        System.out.println("Enter chip type");
        String chipType = scanner.nextLine();
        int choice= scanner.nextInt();
        scanner.nextLine();

        String Chips = "";

        switch (choice) {
            case 1:
                Chips = "Doritos";
                break;
            case 2:
                Chips = "Hot Cheetos";
                break;
            case 3:
                Chips = "Lays";
                break;
            case 4:
                Chips = "Takis";
                break;
            case 5:
                Chips = "Ruffles";
                break;
            default:
                System.out.println("Invalid choice, try again");
                return;
        }

        Chips newChip = new Chips(chipType);
        currentOrder.addChip(newChip);
    }

    public static void checkout() {

        System.out.println("Checkout");
        System.out.println("Total: " + currentOrder.totalPrice());
        Receipt receipt = new Receipt();
        receipt.generateReceiptFile(currentOrder);
        receipt.saveReceipt();

    }

}