/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package marcelo;

/**
 *
 */


import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletOutputStream;
import javax.swing.JOptionPane;
import org.richfaces.event.UploadEvent;
import org.richfaces.model.UploadItem;

/**
 * @author Ilya Shaikovsky
 *
 */
public class FileUploadBean{

	private ArrayList<File> files = new ArrayList<File>();
	private int uploadsAvailable = 5;
	private boolean autoUpload = false;
        private boolean showButton = true;

	public int getSize() {
		if (getFiles().size()>0){
			return getFiles().size();
		}else
		{
			return 0;
		}
	}

	public FileUploadBean() {
	}

	public synchronized void paint(OutputStream stream, Object object) throws IOException {
		stream.write(getFiles().get((Integer)object).getData());
	}
	public synchronized void listener(UploadEvent event) throws Exception{
	    UploadItem item = event.getUploadItem();
	    File file = new File();
	    file.setLength(item.getData().length);
	    file.setName(item.getFileName());
	    file.setData(item.getData());
	    files.add(file);
            this.gravar();            
	    uploadsAvailable--;
	}

	public String clearUploadData() {
		files.clear();
		setUploadsAvailable(5);
		return null;
	}

	public long getTimeStamp(){
		return System.currentTimeMillis();
	}

	public ArrayList<File> getFiles() {
		return files;
	}

	public void setFiles(ArrayList<File> files) {
		this.files = files;
	}

	public int getUploadsAvailable() {
		return uploadsAvailable;
	}

	public void setUploadsAvailable(int uploadsAvailable) {
		this.uploadsAvailable = uploadsAvailable;
	}

	public boolean isAutoUpload() {
		return autoUpload;
	}

    public void setAutoUpload(boolean autoUpload) {
        this.autoUpload = autoUpload;
    }

    public String gravar() {
        for(int x = 0; x < files.size(); x++){
        try {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            java.io.File fileg = new java.io.File("/tmp/teste" + x + ".ok");
            byte[] data = files.get(x).getData();
            b.write(data);
            b.writeTo(new FileOutputStream(fileg));
            JOptionPane.showMessageDialog(null, "nome = " + files.get(0).getName());

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "\nerro " + ex.getCause() + "\nmensagem " + ex.getMessage());
            Logger.getLogger(FileUploadBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        return "sucesso";
    }

    /**
     * @return the showButton
     */
    public boolean isShowButton() {
        return showButton;
    }

    /**
     * @param showButton the showButton to set
     */
    public void setShowButton(boolean showButton) {
        this.showButton = showButton;
    }

    

}
