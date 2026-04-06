package ru.labs.hm1;

public abstract class BaseDecorator implements Component {
    protected Component dish;
    public BaseDecorator(Component dish){
        this.dish = dish;
    }
}
