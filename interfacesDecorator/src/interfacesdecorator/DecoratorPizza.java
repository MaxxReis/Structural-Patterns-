package interfacesdecorator;

public abstract class DecoratorPizza implements IComponentPizza{
    protected IComponentPizza pizzaDecorator;

    @Override
    public void doPizza() {
        pizzaDecorator.doPizza();
    }
    
    public DecoratorPizza(IComponentPizza pizzaDecorator){
        this.pizzaDecorator = pizzaDecorator;
    }
}