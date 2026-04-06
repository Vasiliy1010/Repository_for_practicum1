package ru.labs.hm1;

public class NordBreadDecorator extends BaseDecorator {
    public NordBreadDecorator(Component c) {
        super(c);
    }

    @Override
    public String getName() {
        return super.getName() + " + нордская лепешка";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 7;
    }
}
