package chicken;

import decorator.PizzaDecorator;

public class Chicken extends PizzaDecorator{
    public Chicken(){
        super(null);
    }
    
    @Override
    public void doPizza() {
        pizzaDecorator.doPizza();
        System.out.println("Chicken was added to pizza");
    }
}
