
import java.util.List;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.swing.JOptionPane;
import org.apache.commons.fileupload.DiskFileUpload;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */

public class Arquivos {

    /** Creates a new instance of Arquivos */
    public Arquivos() {
    }

    public String enviar(){
        JOptionPane.showMessageDialog(null, "enviando");
        FacesContext context = FacesContext.getCurrentInstance();
        ServletContext sc = (ServletContext) context.getExternalContext().getContext();
        

        JOptionPane.showMessageDialog(null, "fim");
        return "sucesso";
    }

}
