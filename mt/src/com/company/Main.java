package com.company;

import com.company.abstracts.BasicCar;
import com.company.toppings.Veggie;

public class Main {

    public static void main(String[] args) {
        System.out.println("Small pizza : " + new SmallPizza().cost());

        BasicCar pizza = new Veggie(new SmallPizza());

        System.out.println(pizza.description() + ": " + pizza.cost() + " dollars");
    }
}
