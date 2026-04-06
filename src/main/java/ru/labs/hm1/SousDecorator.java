package ru.labs.hm1;

public class SousDecorator extends BaseDecorator {
    public SousDecorator(Component c) {
        super(c);
    }

    @Override
    public String getName() {
        return super.getName() + " + огненный соус";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }
}
