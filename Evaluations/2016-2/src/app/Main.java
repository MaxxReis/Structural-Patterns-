package app;

import advertising.Advertising1;
import advertising.Advertising2;
import codecs.Mp4;
import codecs.OGV;
import interfaces.IVideo;
import videos.Video1;
import videos.Video2;

public class Main {
    public static void main(String[] args) {
        IVideo video1 = new Video1();
        video1.setCodec(new Mp4());
        
        IVideo videoAdvertising = new Advertising1(new Advertising2(video1));
        videoAdvertising.playVideo();
        
    }
}