package ru.labs.hm1;

public class DeerDecorator implements BaseDecorator {
    BaseDecorator dish;

    DeerDecorator (BaseDecorator dish) {
        this.dish = dish;
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
