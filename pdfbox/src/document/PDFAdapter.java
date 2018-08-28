package document;

import interfaces.IDocument;
import java.io.IOException;

public class PDFAdapter implements IDocument{
    private Document document;

    public PDFAdapter(Document document){
        this.document = document;
    }
    
    @Override
    public boolean openDocument() throws IOException {
        return this.document.openDocumentTxt();
    }

    @Override
    public void showDocument() {
        this.document.showDocumentTxt();
    }
    
}
