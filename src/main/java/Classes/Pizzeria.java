package Classes;

import Enums.TypeOfCompany;
import Enums.TypeOfKitchen;
import Interfaces.IMenu;

public class Pizzeria extends Restaurant implements IMenu {
    public Menu menu;
    public Pizzeria(TypeOfCompany type, String name, double turnover, String location, int numOfWorkers,
                    boolean hasPlaceToPlay, TypeOfKitchen kitchen, double ranking, Menu menu) {
        super(type, name, turnover, location, numOfWorkers, hasPlaceToPlay, kitchen, ranking);
        this.menu = menu;
    }

    @Override
    public double getSumOfProducts() {
        return menu.getSumOfDrinks() + menu.getSumOfFood();
    }
}
