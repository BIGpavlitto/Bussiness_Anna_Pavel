package Classes;

import Enums.TypeOfItems;
import Interfaces.IDrink;
import Interfaces.IFood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu implements IDrink, IFood {
    private Map<String, AmountCol> food;
    private Map<String, AmountCol> drinks;

    public Menu() {
        food = new HashMap<>();
        drinks = new HashMap<>();
    }

    public void addItem(TypeOfItems item, String input, Double cost) {
        if (item == TypeOfItems.drinks) {
            AmountCol amount = new AmountCol(cost, 1);
            drinks.put(input, amount);
        }
        if (item == TypeOfItems.food) {
            AmountCol amount = new AmountCol(cost, 1);
            food.put(input, amount);
        }
    }

    public void addNumOfProduct(TypeOfItems type, String name, int amountUsed) {
        if (type == TypeOfItems.food) {
            for (Map.Entry<String, AmountCol> entry1 :
                    food.entrySet()) {
                if (entry1.getKey().equals(name)) {
                    entry1.getValue().setAmount(amountUsed);
                }
                break;
            }
        }

        if (type == TypeOfItems.drinks) {
            for (Map.Entry<String, AmountCol> entry1 :
                    drinks.entrySet()) {
                if (entry1.getKey().equals(name)) {
                    entry1.getValue().setAmount(amountUsed);
                }
                break;
            }
        }

    }

    @Override
    public double getSumOfDrinks() {
        double sum = 0;
        for (Map.Entry<String, AmountCol> entry1 :
                drinks.entrySet()) {
            sum += (entry1.getValue().getAmount() * entry1.getValue().getPrice());
        }
        return sum;
    }

    @Override
    public double getSumOfFood() {
        double sum = 0;
        for (Map.Entry<String, AmountCol> entry1 :
                food.entrySet()) {
            sum += (entry1.getValue().getAmount() * entry1.getValue().getPrice());
        }
        return sum;
    }
}
