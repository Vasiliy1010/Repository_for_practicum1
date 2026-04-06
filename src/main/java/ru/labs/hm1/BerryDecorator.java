package ru.labs.hm1;

public class BerryDecorator extends BaseDecorator {
    public BerryDecorator (Component dish) {
        super(dish);
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
