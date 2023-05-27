package org.example.sem1;

public class Milk extends HotBeverages{

    public Milk(String kind, double price, Long id, int temperature) {
        super(kind, price, id, temperature);
    }

    @Override
    public String toString() {
        return String.format("У молока: %s, %s, %s", getKind(), getPrice(), getId(), getTemperature());
    }
}
