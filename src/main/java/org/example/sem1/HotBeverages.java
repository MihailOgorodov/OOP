package org.example.sem1;

public class HotBeverages extends Product {

    private Long temperature;

    public HotBeverages(String kind, double price, Long id, Long temperature) {
        super(kind, price, id);
            this.temperature = temperature;
    }

    public Long getTemperature() {
        return temperature;
    }

    public void setTemperature(Long temperature) {
        this.temperature = temperature;
    }
}
