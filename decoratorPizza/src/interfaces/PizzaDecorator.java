package interfaces;

public abstract class PizzaDecorator implements IPizza{
    protected IPizza pizzaDecorator;

    @Override
    public void doPizza() {
        pizzaDecorator.doPizza();
    }
    
    public PizzaDecorator(IPizza pizzaDecorator){
        this.pizzaDecorator = pizzaDecorator;
    }
}
