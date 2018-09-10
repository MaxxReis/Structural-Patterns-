package decorator;

import intefacesdecorator.IComponent;

public abstract class PizzaDecorator implements IComponent{
    protected IComponent pizzaDecorator;
    
    @Override
    public abstract void doPizza();
    
    protected PizzaDecorator(IComponent pizzaDecorator){
        this.pizzaDecorator = pizzaDecorator;
    }
    
    public void setDecorated(IComponent pizzaDecorator){
        this.pizzaDecorator = pizzaDecorator;
    }
    
}
