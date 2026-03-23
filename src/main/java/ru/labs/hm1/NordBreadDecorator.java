package ru.labs.hm1;

public class NordBreadDecorator implements BaseDecorator {
    BaseDecorator dish;

    NordBreadDecorator(BaseDecorator dish) {
        this.dish = dish;
    }

    @Override
    public String getName() {
        return dish.getName() + " + нордская лепешка";
    }

    @Override
    public int getPrice() {
        return dish.getPrice() + 7;
    }
}
