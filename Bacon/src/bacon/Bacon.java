package bacon;

import decorator.PizzaDecorator;

public class Bacon extends PizzaDecorator{
    public Bacon(){
        super(null);
    }
    
    @Override
    public void doPizza() {
        pizzaDecorator.doPizza();
        System.out.println("Bacon was added to pizza");
    }
}
