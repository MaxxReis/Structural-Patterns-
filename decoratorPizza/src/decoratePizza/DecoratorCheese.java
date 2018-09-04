package decoratePizza;

import interfaces.DecoratorPizza;
import interfaces.IComponentPizza;

public class DecoratorCheese extends DecoratorPizza{
    public DecoratorCheese(IComponentPizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public void doPizza() {
        doPizzaChesse();
        
    }
    
    private void doPizzaChesse(){
        System.out.println("Chesse was added to pizza");
    }
}
