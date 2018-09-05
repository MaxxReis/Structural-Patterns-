package decoratorHam;

import interfacesdecorator.DecoratorPizza;
import interfacesdecorator.IComponentPizza;
import interfacesdecorator.IPlugin;

public class DecoratorHam extends DecoratorPizza implements IPlugin{
    public DecoratorHam(){
        super(null);
    }
    
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

    @Override
    public void initialize() {
        //empty
    }
}
