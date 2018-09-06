package app;

import baseDecorate.PizzaSimple;

import interfacesdecorator.IComponentPizza;
import java.util.ArrayList;
import plugin.Plugin;

public class Main {
    public static void main(String[] args) {
        ArrayList<IComponentPizza> pizzas = new ArrayList<>();
        
        //pizzas.add(new PizzaSimple());
        //pizzas.add(new DecoratorChicken(new PizzaSimple()));
        //pizzas.add(new DecoratorCheese(new PizzaSimple()));
        //to do more examples
        //pizzas.add(new DecoratorCheese(new DecoratorChicken(new PizzaSimple())));
        
        //IComponentPizza pizzaDecorator = new DecoratorChesse(new PizzaSimple());
        //pizzaDecorator.doPizza();
        
        for(IComponentPizza pizza : pizzas){
            System.out.print(" ->");
            pizza.doPizza();
            System.out.print("\n");
        }
        Plugin plugin = new Plugin();
        System.out.println(plugin.getLoadedPlugin());
    }
}
