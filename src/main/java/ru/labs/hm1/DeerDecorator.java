package ru.labs.hm1;

public class DeerDecorator extends BaseDecorator {
    public DeerDecorator(Component c) {
        super(c);
    }

    @Override
    public String getName() {
        return super.getName() + " + двойная порция оленины";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 20;
    }
}
