package ru.labs.hm1;

public class BerryDecorator implements BaseDecorator {
    BaseDecorator dish;

    BerryDecorator (BaseDecorator dish) {
        this.dish = dish;
    }

    @Override
    public String getName() {
        return dish.getName() + " + снежные ягоды";
    }

    @Override
    public int getPrice() {
        return dish.getPrice() + 5;
    }
}
