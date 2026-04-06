package ru.labs.hm1;

public abstract class BaseDecorator implements Component {
    private Component dish;

    public BaseDecorator(Component c){
        this.dish = c;
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
