package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class HomeScreen {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new HomeScreen().displayHomeScreen();
    }

    public void displayHomeScreen() {

        while (true) {
            System.out.println("WELCOME TO ANITASSAVORWICH!");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.println("Choose option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayHomeScreen();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice, try again");

            }
            return;

           // public static void displayHomeScreen (Scanner scanner){
                Order order = new Order();
                System.out.println("1. Add sandwich");
                System.out.println("2. Add Drink");
                System.out.println("3. Add Chips");
                System.out.println("4. Add Checkout");
                System.out.println("0. Cancel Order");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Sandwich Options");
                        order.addSandwich();
                        break;
                    case 2:
                        order.addDrink();
                        break;
                    case 3:
                        order.addChip();
                        break;
                    case 4:
                        checkout(scanner);
                        break;
                    default:
                        System.out.println("Invalid, please try again");

                }


            }



        }

    }
    public void displayAddSandwich(Scanner scanner) {
        List<Topping> toppings = new ArrayList<>();
        System.out.println("Bread options: White, Wheat, Rye, Wrap");
        System.out.println("Enter the name of bread");
        String bread = scanner.nextLine();

        System.out.println("Sandwich sizes (small, medium, or large");
        System.out.println("Plese enter sandwich size: ");
        int sandwich = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Meat options: Steak, Ham, Salami, Roast Beef, Chicken, Bacon. ");
        System.out.println("Pleasse enter the type of meat: ");
        String meat = scanner.nextLine();
        //Toppings.add(meat);
        System.out.println("Would you like extra meat? (yes/no");
        boolean extraMeat = scanner.nextLine().equalsIgnoreCase("yes");
        boolean exit = false;
        while (!exit) {
        System.out.println("Enter another meat topping or exit to stop");
       // meats = scanner.nextLine();
        // if (meats.equalsIgnoreCase("exit")) {
       // }else {
           // meatToppings.add(meat);
            System.out.println("Cheese Option: American, Provolone, Cheddar, Swiss");
            System.out.println("Enter type of cheese");

            String cheese = scanner.nextLine();
            //cheeseToppings.add(cheese);
            scanner.nextLine();

            System.out.println("Would you like extra cheese? (yes or no)");
            boolean extraCheese = scanner.nextLine().equalsIgnoreCase("yes");

            exit = false;
            while (!exit) {
                System.out.println("Enter a cheese topping or exit to stop");
                cheese = scanner.nextLine();
                if (cheese.equalsIgnoreCase("exit")) ;
                exit = true;

          //  } else {
               // cheese.Toppings.add(cheese);
                // System.out.println(cheeseToppings);

            }
        }
            System.out.println("Regular Topping options: Lettuce, Peppers, Onioins, Tomatoes, Jalapenos, Cucumbers, Pickles, Guacmole, Mushroom");
            System.out.println("Please enter toppings: ");
            scanner.nextLine();

            exit = false;
            while (!exit) {
                System.out.println("Enter another topping or exit to stop ");
            //    regularToppings = scanner.nextLine();
            //    if (regularToppings.equalsIgnoreCase("exit")) ;
                exit = true;
            } else {
           //     regularToppings.add(regularToppings);
            }
        }
      //  System.out.println("Sauce options: Mayo, Mustard, Ketchup, Ranch, Thousand Islands, Vinaigrette");
        // System.out.println("Please enter a sauce");
        // sauces.add(sauce);
        // scanner.nextLine();

        // exit = false;
        // while(!exit) {
         //   System.out.println("Enter another sauce or exit to stop ");
           // sauce = scanner.nextLine();
            //if (sauce.equalsIgnoreCase("exit")) {
              //  exit = true;
            //} else {
              //  sauces.add(sauce);
                //System.out.println(sauces);
            }
       // }
        //System.out.println("Would you like your sandwich to be toasted? (yes or no)");
       // String toasted = scanner.nextLine();












