package videos;

import interfaces.ICodec;
//import interfaces.IVideo;
import interfaces.VideoDecorator;

public class Video1 extends VideoDecorator{
    public void playVideo() {
        codec.startCodec();
        System.out.println("Video 1 is running...");
    }
    
}
