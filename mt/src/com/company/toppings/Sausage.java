package com.company.toppings;

import com.company.ToppingsDecorator;
import com.company.abstracts.BasicCar;

public class Sausage extends ToppingsDecorator {
    BasicCar pizza;

    public Sausage(BasicCar pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 2;
    }

    @Override
    public String description() {
        return "Sausage " + this.pizza.description();
    }
}
