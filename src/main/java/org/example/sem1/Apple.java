package org.example.sem1;

import org.w3c.dom.ls.LSOutput;

public class Apple extends Product {

    public Apple(String kind, double price, Long id) {
        super(kind, price, id);
    }

    @Override
    public String toString() {
        return String.format("У яблока: %s, %s, %s", getKind(), getPrice(), getId());
    }
}
