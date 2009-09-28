
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.richfaces.event.UploadEvent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */

public class UploadMB {
    public List itens = new ArrayList();

    public List getItens() {
        return itens;
    }

    public void setItens(List itens) {
        this.itens = itens;
    }
    /** Creates a new instance of UploadMB */
    public UploadMB() {
    }
    public void upload(UploadEvent event){
        this.itens.add(event.getUploadItem());
    }


      public void fileUploadListener(UploadEvent event){
            File uploadedFile = event.getUploadItem().getFile();
            if(uploadedFile.renameTo(new File(uploadedFile.getName())))
            {
                System.out.println("************************ok");
            }
            else
            {
                System.out.println("*************************erro");
            }
        }


}
