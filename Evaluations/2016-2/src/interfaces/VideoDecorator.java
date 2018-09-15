package interfaces;

import interfaces.ICodec;
import interfaces.IVideo;

public class VideoDecorator extends IVideo{
    protected IVideo videoDecorator;
    
    protected VideoDecorator(){}
    
    protected VideoDecorator(IVideo video){
        this.videoDecorator = video;
    }
    
    public void setDecorated(IVideo video){
        this.videoDecorator = videoDecorator;
    }

    @Override
    public void playVideo() {
        videoDecorator.playVideo();
    }
    
   
    
}
