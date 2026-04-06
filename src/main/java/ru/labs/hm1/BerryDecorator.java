package ru.labs.hm1;

public class BerryDecorator extends BaseDecorator {
    public BerryDecorator(Component c) {
        super(c);
    }

    @Override
    public String getName() {
        return super.getName() + " + снежные ягоды";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 5;
    }
}
