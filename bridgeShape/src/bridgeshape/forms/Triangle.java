package bridgeshape.forms;

import bridgeshape.interfaces.IColor;

public class Triangle extends Shape{
    public Triangle(IColor color){
        super(color);
    }
    
    @Override
    public void applyColor() {
        System.out.println("Triangle filled with color: ");
        color.applyColor();
    }
}
