package bridgeshape.app;

import bridgeshape.colors.GreenColor;
import bridgeshape.colors.RedColor;
import bridgeshape.forms.Pentagon;
import bridgeshape.forms.Shape;
import bridgeshape.forms.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();
        
        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();
    }
}
