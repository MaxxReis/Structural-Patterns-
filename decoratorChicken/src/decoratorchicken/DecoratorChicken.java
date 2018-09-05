package decoratorchicken;

import interfacesdecorator.DecoratorPizza;
import interfacesdecorator.IComponentPizza;
import interfacesdecorator.IPlugin;

public class DecoratorChicken extends DecoratorPizza implements IPlugin{
    public DecoratorChicken(){
        super(null);
    }
    
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

    @Override
    public void initialize() {
        //empty
    }
    
}
