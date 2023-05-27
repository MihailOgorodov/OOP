package org.example.sem1;

public class HotBeverages extends Product{

    private int temperature;
    public HotBeverages(String kind, double price, Long id, int temperature) {
        super(kind, price, id);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
