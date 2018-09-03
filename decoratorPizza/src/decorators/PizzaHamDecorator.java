package decorators;

import interfaces.IPizza;
import interfaces.PizzaDecorator;

public class PizzaHamDecorator extends PizzaDecorator{
    public PizzaHamDecorator(IPizza pizzaDecorator) {
        super(pizzaDecorator);
    }

    @Override
    public void doPizza() {
        doPizzaHam();
        pizzaDecorator.doPizza();
    }
    
    private void doPizzaHam(){
        System.out.println("Pizza Ham was done");
    }
}
