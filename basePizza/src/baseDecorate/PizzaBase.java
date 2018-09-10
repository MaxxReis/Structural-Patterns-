package baseDecorate;

import intefacesdecorator.IComponent;

public class PizzaBase implements IComponent{
    @Override
    public void doPizza() {
        System.out.println("Simple Pizza with cheese and tomato sauce");
    }
}
