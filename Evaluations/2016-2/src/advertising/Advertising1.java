package advertising;

import interfaces.ICodec;
import interfaces.IVideo;
import interfaces.VideoDecorator;

public class Advertising1 extends VideoDecorator{
    public Advertising1(IVideo videoDecorated){
        super(videoDecorated);
    }
    
    @Override
    public void playVideo() {
        System.out.println("Advertising 1 is running...");
        videoDecorator.playVideo();
    }
}
