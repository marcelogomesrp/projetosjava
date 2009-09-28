
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String origem = args[0]; //"/data/corrida42.csv";
        String destino = args[1]; //"/data/corrida42_nova.csv";
        String lineage = args[2]; //"2";
        String plataforma = args[3]; // 13;

        try {
            BufferedReader in = new BufferedReader(new FileReader(origem));
            File arquivo = new File(destino);
            FileOutputStream fos = new FileOutputStream(arquivo);

            String str;
//            str = "m\"arcelo";
//            String v = str.replaceAll("\"", "");
//            System.out.println(str + " - " + v);
            while (in.ready()) {
                str = in.readLine().replaceAll("\"", "");
                String s[] = str.split("\\,");
                //System.out.println(s[2]);
                Pattern padrao = Pattern.compile("a");
                //System.out.println(s[2].charAt(s[2].length()-1));
                fos.write((str + "," + s[2].charAt(s[2].length()-1) + ","+ lineage + "," + plataforma + "\n").getBytes());

                //String p = s[2];
                //System.out.println("Tamanho: " + p.length());
                //System.out.println(p.charAt(p.length()-1));
            }
            in.close();
            fos.close();
        } catch (IOException e) {
        }


    }
}
