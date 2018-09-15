package interfaces;

public abstract class IVideo {
    protected ICodec codec;

    public void setCodec(ICodec codec){
        this.codec = codec;
    }
    
    public abstract void playVideo();
}
