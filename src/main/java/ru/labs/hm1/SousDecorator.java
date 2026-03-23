package ru.labs.hm1;

public class SousDecorator implements BaseDecorator {
    BaseDecorator dish;

    SousDecorator (BaseDecorator dish) {
        this.dish = dish;
    }

    @Override
    public String getName() {
        return dish.getName() + " + огненный соус";
    }

    @Override
    public int getPrice() {
        return dish.getPrice() + 10;
    }
}
