/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package livro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.apache.myfaces.trinidad.model.UploadedFile;

/**
 *
 * @author marcelo
 */

public class Upload {
    private UploadedFile arquivo;

    public String salvar(){
        FacesContext context = FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) context.getExternalContext().getContext();
        if(arquivo != null){
            InputStream stream = null;
            try {
                String tipoDeArquivo = arquivo.getContentType();
                stream = arquivo.getInputStream();
                int fSize = (int) arquivo.getLength();
                byte[] buffer = new byte[(int) fSize];
                String nomeArquivo = arquivo.getFilename();
                Boolean salvarEstado = this.salvarArquivo(buffer, stream, nomeArquivo, fSize, sc.getRealPath("/imagens"));
            } catch (IOException ex) {
                Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    stream.close();
                } catch (IOException ex) {
                    Logger.getLogger(Upload.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return "sucesso";
    }
    public UploadedFile getArquivo() {
        return arquivo;
    }

    public void setArquivo(UploadedFile arquivo) {
        this.arquivo = arquivo;
    }


    /** Creates a new instance of Upload */
    public Upload() {
    }

    private Boolean salvarArquivo(byte[] buffer, InputStream stream, String nomeArquivo, int fSize, String realPath) throws FileNotFoundException, IOException{
        File file = new File(realPath + "/" + nomeArquivo);
        FileOutputStream output = new FileOutputStream(file);
        try{
        while(true){
            int count = stream.read(buffer, 0, fSize);
            if(count == -1){
                break;
            }
            output.write(buffer, 0, count);
        }
        }catch(Exception ex){
            ex.printStackTrace();
            return false;
        }
        finally{
            output.flush();
            output.close();
            stream.close();
        }
        return true;
    }

}
