package decoratorchicken;

import interfacesdecorator.DecoratorPizza;
import interfacesdecorator.IComponentPizza;

public class DecoratorChicken extends DecoratorPizza{
    public DecoratorChicken(IComponentPizza pizzaDecorator) {
        super(pizzaDecorator);
    }
    
    public void DecoratorChicken(){
        doPizzaChicken();
        pizzaDecorator.doPizza();
    }
    
    private void doPizzaChicken(){
        System.out.println("Pizza Chicken was done");
    }
    
}
