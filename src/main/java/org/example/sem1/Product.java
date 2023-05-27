package org.example.sem1;

public abstract class Product {

    private String kind;
    private Long id;
    private double price;

    public Product(String kind, double price, Long id) {
        this.kind = kind;
        this.id = id;
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
