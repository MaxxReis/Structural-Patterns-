package document;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Document {
    public boolean openDocumentTxt() {
        try {
            FileReader arq = new FileReader("documents/hello.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();
            return true;
        } catch (IOException e) {
            System.err.printf("Fail to read: %s.\n",
                    e.getMessage());
            return false;
        }
    }
 
    public void showDocumentTxt() {
        if (openDocumentTxt() == true) {
            JOptionPane.showMessageDialog(null, "PDF is ok", "Sucesso", JOptionPane.NO_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "PDF error", "Error", JOptionPane.OK_OPTION);
        }

    }
}
