package advertising;

import interfaces.ICodec;
import interfaces.IVideo;
import interfaces.VideoDecorator;

public class Advertising2 extends VideoDecorator{
    public Advertising2(IVideo videoDecorated){
        super(videoDecorated);
    }
    
    @Override
    public void playVideo() {
        videoDecorator.playVideo();
        System.out.println("Advertising 2 is running...");
    }
}
