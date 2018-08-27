package bridgeshape.forms;

import bridgeshape.interfaces.IColor;

public abstract class Shape {
    //Composition
    protected IColor color;
    
    //constructor
    public Shape(IColor color){
        this.color = color;
    }
    
    abstract public void applyColor();
}
