package ru.labs.hm1;

public class ConcreteComponent implements Component {
    @Override
    public String getName() {
        return "Нордское рагу";
    }

    @Override
    public int getPrice() {
        return 50;
    }
}
