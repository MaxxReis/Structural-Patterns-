package videos;

import interfaces.ICodec;
import interfaces.IVideo;
import interfaces.VideoDecorator;

public class Video2 extends VideoDecorator{
    
    @Override
    public void playVideo() {
        codec.startCodec();
        System.out.println("Video 2 is running...");
    }
}
