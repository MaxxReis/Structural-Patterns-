package codecs;

import interfaces.ICodec;

public class OGV implements ICodec{
    @Override
    public void startCodec() {
        System.out.println("Current codec is OGV...");
    }
}
