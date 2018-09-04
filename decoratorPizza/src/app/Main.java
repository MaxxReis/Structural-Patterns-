package app;

import baseDecorate.PizzaSimple;
import decoratePizza.DecoratorChicken;
import decoratePizza.DecoratorHam;
import interfaces.IComponentPizza;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IComponentPizza> pizzas = null;
        
        pizzas.add(new PizzaSimple());
        pizzas.add(new DecoratorChicken(new PizzaSimple()));
        //to do more examples
        
        IComponentPizza pizzaDecorator = new DecoratorHam(new PizzaSimple());
        pizzaDecorator.doPizza();
    }
}
