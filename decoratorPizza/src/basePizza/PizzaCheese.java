package basePizza;

import interfaces.IPizza;

public class PizzaCheese implements IPizza{
    @Override
    public void doPizza() {
        System.out.println("Pizza Cheese was done");
    }
}
