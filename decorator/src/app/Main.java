package app;

import decorators.DecoratorVerticalBar;
import baseWindow.SimpleWindow;
import interfaces.IWindow;

public class Main {
    public static void main(String[] args) {
        IWindow windowDecorator = new DecoratorVerticalBar(new SimpleWindow());
        windowDecorator.draw();
    }
}
