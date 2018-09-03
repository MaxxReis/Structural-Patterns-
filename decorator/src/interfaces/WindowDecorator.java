package interfaces;

import interfaces.IWindow;

public abstract class WindowDecorator implements IWindow{
    protected IWindow windowDecorator;

    @Override
    public void draw() {
        windowDecorator.draw();
    }
    
    public WindowDecorator(IWindow windowDecorator){
        this.windowDecorator = windowDecorator;
    }
}
