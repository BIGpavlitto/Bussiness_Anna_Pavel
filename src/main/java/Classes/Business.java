package Classes;

import Enums.TypeOfCompany;

public abstract class Business {
    protected TypeOfCompany type;
    protected String name;
    private double turnover;
    protected String location;
    protected int numOfWorkers;

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    public Business(TypeOfCompany type, String name, double turnover, String location, int numOfWorkers) {
        this.type = type;
        this.name = name;
        this.turnover = turnover;
        this.location = location;
        this.numOfWorkers = numOfWorkers;
    }
}
