package decoratePizza;

import interfaces.DecoratorPizza;
import interfaces.IComponentPizza;

public class DecoratorHam extends DecoratorPizza{
    public DecoratorHam(IComponentPizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public void doPizza() {
        doPizzaHam();
        pizzaDecorator.doPizza();
    }
    
    private void doPizzaHam(){
        System.out.println("Ham was added to pizza");
    }
}