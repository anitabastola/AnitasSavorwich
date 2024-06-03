package com.pluralsight;

import java.sql.SQLOutput;
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

                }
            }



    }






}
