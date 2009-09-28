/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package springcfg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author marcelo
 */
public class AcessoSpring {
    private static ApplicationContext springContext;

    public static synchronized ApplicationContext getSpringContext() {
        if(springContext == null){
            springContext = new ClassPathXmlApplicationContext("cfg/Spring.xml");
        }
        return springContext;
    }


    public static void setSpringContext(ApplicationContext springContext) {
        AcessoSpring.springContext = springContext;
    }

    public AcessoSpring() {
    }    

}
