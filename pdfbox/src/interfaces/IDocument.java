package interfaces;

import java.io.IOException;

public interface IDocument {
    boolean openDocument() throws IOException;
    void showDocument();
}
