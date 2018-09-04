package app;

import baseDecorate.PizzaSimple;
import decoratorchicken.DecoratorChicken;
import decoratorcheese.DecoratorCheese;
import interfacesdecorator.IComponentPizza;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IComponentPizza> pizzas = null;
        
        pizzas.add(new PizzaSimple());
        pizzas.add(new DecoratorChicken(new PizzaSimple()));
        pizzas.add(new DecoratorCheese(new PizzaSimple()));
        //to do more examples
        pizzas.add(new DecoratorCheese(new DecoratorChicken(new PizzaSimple())));
        
        //IComponentPizza pizzaDecorator = new DecoratorChesse(new PizzaSimple());
        //pizzaDecorator.doPizza();
        
        for(IComponentPizza pizza : pizzas){
            System.out.print(" ->");
            pizza.doPizza();
            System.out.print("\n");
        }
    }
}
