package bridgeshape.forms;

import bridgeshape.interfaces.IColor;

public class Pentagon extends Shape{
    
    public Pentagon(IColor color) {
            super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color: ");
        color.applyColor();
    }
}
