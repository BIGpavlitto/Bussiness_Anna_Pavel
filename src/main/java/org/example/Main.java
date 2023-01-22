package org.example;

import Classes.Menu;
import Classes.Pizzeria;
import Enums.TypeOfCompany;
import Enums.TypeOfItems;
import Enums.TypeOfKitchen;

public class Main {
    public static void main(String[] args) {
        //italian cuisine
        Menu italian = new Menu();
        italian.addItem(TypeOfItems.food, "Pizza Americana", 10.5);
        italian.addItem(TypeOfItems.drinks, "Cola", 1.5);
        italian.addItem(TypeOfItems.food, "Pizza Margareta", 11.5);
        italian.addItem(TypeOfItems.drinks, "tea", 0.5);

        Pizzeria pizzaPan = new Pizzeria(TypeOfCompany.privateLimitedCompany, "Q Pizza&Pan", 50_450,
                "Telliskivi 62", 2, false, TypeOfKitchen.italian, 4.8, italian);

        //add pizza Americana to amount of 20
        pizzaPan.menu.addNumOfProduct(TypeOfItems.food, "Pizza Americana", 20);
        //add pizza Margareta to amount of 15
        pizzaPan.menu.addNumOfProduct(TypeOfItems.food, "Pizza Margareta", 15);
        //add cola to amount of 10
        pizzaPan.menu.addNumOfProduct(TypeOfItems.food, "Cola", 10);


        //total sum of revenues
        double sum = pizzaPan.getSumOfProducts();
        System.out.println("Sum of revenues ordered: " + sum);
    }
}