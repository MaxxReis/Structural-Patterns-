package document;

import interfaces.IDocument;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class PDFDocument implements IDocument{
    

    @Override
    public void showDocument() {
        try {
            if (openDocument() == true) {
                JOptionPane.showMessageDialog(null,"PDF was read", "Sucess",JOptionPane.NO_OPTION);
            } else {
                JOptionPane.showMessageDialog(null,"Fail to read PDF", "Error",JOptionPane.OK_OPTION);
            }
        } catch (IOException ex) {
            Logger.getLogger(PDFDocument.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean openDocument() throws IOException {
        try (PDDocument document = PDDocument.load(new File("documents/LittleBookOfSemaphores.pdf"))){
            document.getClass();
            if(!document.isEncrypted()){
                PDFTextStripperByArea textStripperArea = new PDFTextStripperByArea();
                textStripperArea.setSortByPosition(true);
                PDFTextStripper textStripper = new PDFTextStripper();
                String pdfFileInText = textStripper.getText(document);
                String lines[] = pdfFileInText.split("\\r?\\n");
                for (String line : lines) {
                    System.out.println(line);
                }
            }
            //System.out.println("Document Opened!");
            return true;
        } catch (Exception e) {
            Logger.getLogger(PDFDocument.class.getName()).log(Level.SEVERE, null, e);
            //System.out.println("Error: Fail to load document!");
            return false;
        }
    }
}
