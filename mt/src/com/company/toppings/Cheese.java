package com.company.toppings;

import com.company.ToppingsDecorator;
import com.company.abstracts.BasicCar;

public class Cheese extends ToppingsDecorator {
    BasicCar pizza;

    public Cheese(BasicCar pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return this.pizza.cost() + 2;
    }

    @Override
    public String description() {
        return "Cheese " + this.pizza.description();
    }
}
