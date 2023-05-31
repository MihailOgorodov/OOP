package org.example.hm2;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    abstract String getName();

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public void setMakeOrder() {
        System.out.println(name + " сделал заказ");
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        System.out.println(name + " забрал заказ");
        isTakeOrder = true;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }
}
