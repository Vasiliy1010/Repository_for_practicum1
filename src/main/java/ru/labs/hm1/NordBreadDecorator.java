package ru.labs.hm1;

public class NordBreadDecorator extends BaseDecorator {
    public NordBreadDecorator(Component dish) {
       super(dish);
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
