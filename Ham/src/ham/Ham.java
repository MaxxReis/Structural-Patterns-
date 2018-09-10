package ham;

import decorator.PizzaDecorator;

public class Ham extends PizzaDecorator{
    public Ham(){
        super(null);
    }

    @Override
    public void doPizza() {
        pizzaDecorator.doPizza();
        System.out.println("Ham was added to pizza");
    }
}
