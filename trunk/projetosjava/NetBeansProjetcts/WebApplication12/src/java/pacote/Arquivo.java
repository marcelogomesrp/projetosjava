/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pacote;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JOptionPane;
import org.apache.myfaces.trinidad.model.UploadedFile;

/**
 *
 * @author marcelo
 */

public class Arquivo {
    private UploadedFile arquivo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UploadedFile getArquivo() {
        return arquivo;
    }

    public void setArquivo(UploadedFile arquivo) {
        this.arquivo = arquivo;
    }

    public String doDownload() throws FileNotFoundException, IOException{
        JOptionPane.showMessageDialog(null, "inicio");
        this.nome = arquivo.getFilename();
        File file = new File("/tmp/teste.txt");
        int size = (int) arquivo.getLength();
        byte[] buf = new byte[size];
        InputStream stream = arquivo.getInputStream();
        FileOutputStream output = new FileOutputStream(file);
       
        try{
            while(true){
                int count = stream.read(buf, 0, size);
                if(count == -1){
                    break;
                }
                output.write(buf,0,count);
            }
        } catch (Exception ex) {
            System.out.println("Eroooooooooooooooooo: " + ex.getCause());
            ex.printStackTrace();
            return "falha" ;
        } finally{
            output.flush();
            output.close();
            stream.close();
        }
        return "sucesso";
    }
    /** Creates a new instance of Arquivo */
    public Arquivo() {
    }

}
