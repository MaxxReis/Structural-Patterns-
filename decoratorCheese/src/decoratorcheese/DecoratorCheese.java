package decoratorcheese;

import interfacesdecorator.DecoratorPizza;
import interfacesdecorator.IComponentPizza;

public class DecoratorCheese extends DecoratorPizza{
    public DecoratorCheese(IComponentPizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public void doPizza() {
        doPizzaChesse();
        pizzaDecorator.doPizza();
    }
    
    private void doPizzaChesse(){
        System.out.println("Chesse was added to pizza");
    }
}
