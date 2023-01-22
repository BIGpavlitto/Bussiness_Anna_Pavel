package Classes;

import Enums.TypeOfCompany;
import Enums.TypeOfKitchen;

import java.util.HashMap;
import java.util.Map;

public class Restaurant extends Business {
    protected boolean hasPlaceToPlay;
    protected TypeOfKitchen kitchen;
    protected double ranking;

    public Restaurant(TypeOfCompany type, String name, double turnover, String location, int numOfWorkers,
                      boolean hasPlaceToPlay, TypeOfKitchen kitchen, double ranking) {
        super(type, name, turnover, location, numOfWorkers);
        this.hasPlaceToPlay = hasPlaceToPlay;
        this.kitchen = kitchen;
        this.ranking = ranking;
    }
}
