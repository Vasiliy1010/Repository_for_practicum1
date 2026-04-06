package ru.labs.hm1;

public class DeerDecorator extends BaseDecorator {
    public DeerDecorator (Component dish) {
        super(dish);
    }

    @Override
    public String getName() {
        return dish.getName() + " + двойная порция оленины";
    }

    @Override
    public int getPrice() {
        return dish.getPrice() + 20;
    }
}
