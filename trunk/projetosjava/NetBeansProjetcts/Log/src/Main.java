
import java.io.IOException;
import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;




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

    static Logger logger = Logger.getLogger(Main.class);
    

    public static void main(String[] args) throws IOException{
//        Layout layout = new SimpleLayout();
//        Appender appender = new FileAppender(layout, "teste");
//    	BasicConfigurator.configure(appender);
    	//BasicConfigurator.configure();
        logger.debug("Comecando");    
        Hello hello = new Hello();
        hello.fala();
        hello.divide();
        if(logger.isDebugEnabled()){
            System.out.println("Seu log esta com o mode debug ativado");
        }
        hello = null;


    }

}
