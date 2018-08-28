package app;

import document.PDFDocument;
import interfaces.IDocument;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException {
        IDocument document = new PDFDocument();
        document.openDocument();
        document.showDocument();
    }  
}
