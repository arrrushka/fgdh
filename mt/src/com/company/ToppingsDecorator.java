package com.company;

import com.company.abstracts.BasicCar;

public abstract class ToppingsDecorator implements BasicCar {
    public abstract double cost();
    public abstract String description();
}
