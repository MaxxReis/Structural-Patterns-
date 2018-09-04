package baseDecorate;

import interfaces.IComponentPizza;

public class PizzaSimple implements IComponentPizza{
    @Override
    public void doPizza() {
        System.out.println("Pizza Simple was done");
    }
}
