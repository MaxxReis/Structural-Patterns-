package baseWindow;

import interfaces.IWindow;

public class SimpleWindow implements IWindow{
    @Override
    public void draw() {
        System.out.println("Windrow was drawn");
    }
}
