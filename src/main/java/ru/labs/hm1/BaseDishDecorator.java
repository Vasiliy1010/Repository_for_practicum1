package ru.labs.hm1;

public class BaseDishDecorator implements BaseDecorator {
    @Override
    public String getName() {
        return "Нордское рагу";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
