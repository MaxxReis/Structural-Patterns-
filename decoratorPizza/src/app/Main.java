package app;

import basePizza.PizzaCheese;
import decorators.PizzaHamDecorator;
import interfaces.IPizza;

public class Main {
    public static void main(String[] args) {
        IPizza pizzaDecorator = new PizzaHamDecorator(new PizzaCheese());
        pizzaDecorator.doPizza();
    }
}
