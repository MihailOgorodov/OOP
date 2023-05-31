package org.example.hm2;

public class Main {
    public static void main(String[] args) {

        Human human1 = new Human("Bob", 33, "Washington");

        System.out.println(human1);
        human1.setMakeOrder();
        System.out.println(human1);
        human1.setTakeOrder();
        System.out.println(human1);

    }
}
