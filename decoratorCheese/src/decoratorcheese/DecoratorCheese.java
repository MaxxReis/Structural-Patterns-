package decoratorcheese;

import interfacesdecorator.DecoratorPizza;
import interfacesdecorator.IComponentPizza;
import interfacesdecorator.IPlugin;

public class DecoratorCheese extends DecoratorPizza implements IPlugin{
    public DecoratorCheese(){
        super(null);
    }
    
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

    @Override
    public void initialize(){
        //empty
    }
}
