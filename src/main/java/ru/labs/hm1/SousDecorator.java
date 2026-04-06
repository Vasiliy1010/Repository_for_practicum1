package ru.labs.hm1;

public class SousDecorator extends BaseDecorator {
    public SousDecorator (Component dish) {
        super(dish);
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
