package decorators;

import interfaces.*;

public class DecoratorVerticalBar extends WindowDecorator{
    public DecoratorVerticalBar(IWindow windowDecorator){
        super(windowDecorator);
    }
    
    @Override
    public void draw() {
        drawVerticalBar();
        windowDecorator.draw();
    }
    
    private void drawVerticalBar(){
        System.out.println("Vertical Bar was Drawn");
    }
    
}
