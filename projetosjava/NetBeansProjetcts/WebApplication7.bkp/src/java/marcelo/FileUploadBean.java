/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package marcelo;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.richfaces.event.UploadEvent;
import org.richfaces.model.UploadItem;




/**
 * @author Ilya Shaikovsky
 *
 */
public class FileUploadBean{

    public FileUploadBean() {
    }

    public void upload(UploadEvent evento) throws FileNotFoundException, IOException, Exception{
        JOptionPane.showMessageDialog(null, "inicio");
//        File fOut = new File("teste.ok");
//        this.copyFile(evento.getUploadItem().getFile(), fOut);
        UploadItem item = evento.getUploadItem();

            File file = item.getFile();
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            String tt = this.armazenarImagem(b, item.getData(), "teste.txt");

        JOptionPane.showMessageDialog(null, "fim");
    }


    public String armazenarImagem(ByteArrayOutputStream b,byte[] data, String imagemName) throws Exception{
			b.write(data);
			File file = new File("teste.jpg");
			b.writeTo(new FileOutputStream(file));
		return "teste.jpg";
	}


    public void copyFile (File fIn, File fOut) throws IOException {
        FileInputStream fis = new FileInputStream (fIn);
        FileOutputStream fos = new FileOutputStream (fOut);
        FileChannel fcIn = fis.getChannel();
        FileChannel fcOut = fos.getChannel();
		//  Para arquivos muito grandes há problemas se usarmos transferFrom com o parâmetro "count" > 2GB.
		// Portanto, iremos fazer a transferência "em pedaços".
		long totalLength = fIn.length();
		int chunkSize = 8 * 1024 * 1024; // 8 MB de cada vez deve ser suficiente...
		long position = 0;
		long remainder = totalLength % chunkSize;
		long bytesLeft = totalLength;
		long totalWritten = 0;
		// Observe o caso do último bloco a ser escrito...
		final double mbytes_second = 1 / 1024.0 / 1024.0 * 1000.0;
		for (position = 0; position < totalLength; position += chunkSize) {
		    long bytesToWrite = Math.min (bytesLeft, chunkSize);
			fcOut.transferFrom (fcIn, position, bytesToWrite);
			totalWritten = position + bytesToWrite;
			bytesLeft -= chunkSize;
		}
        fos.close();
        fis.close();
	}



        public synchronized String saveUploadedFile(UploadItem uploadedFile, String path) {
        String name = uploadedFile.getFileName();
        String fullPath = name;
        FileOutputStream fos = null;
        try {
            File f = new File(fullPath);
            f.createNewFile();

            fos = new FileOutputStream(f);
            fos.write(uploadedFile.getData()); // <-- gera a exceção aqui ó . . .
            fos.close();
            return path + name;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

//         public void upload(UploadEvent evento){
//
//        FileOutputStream out = null;
//        try {
//            JOptionPane.showMessageDialog(null, "estou enviando..2.");
//            //String fileName = evento.getUploadItem().getFileName();
//            File arquivo = evento.getUploadItem().getFile();
//            JOptionPane.showMessageDialog(null, "valor " + arquivo.getName());
//            out = new FileOutputStream("arq2.txt");
//            out.write(evento.getUploadItem().getData());
//
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(null, "Enviado" + ex.getCause());
//            System.out.println("Erooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo " + ex.getMessage());
//            Logger.getLogger(FileUploadBean.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            try {
//                out.flush();
//                out.close();
//                 JOptionPane.showMessageDialog(null, "Enviado");
//            } catch (IOException ex) {
//                Logger.getLogger(FileUploadBean.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }


}