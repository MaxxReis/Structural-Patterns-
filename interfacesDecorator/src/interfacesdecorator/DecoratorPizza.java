package interfacesdecorator;

public abstract class DecoratorPizza implements IComponentPizza{
    protected IComponentPizza pizzaDecorator;

    @Override
    public abstract void doPizza();    
    
    protected DecoratorPizza(IComponentPizza pizzaDecorator){
        this.pizzaDecorator = pizzaDecorator;
    }
}