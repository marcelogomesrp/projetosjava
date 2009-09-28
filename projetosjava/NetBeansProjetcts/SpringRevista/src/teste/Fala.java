/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import org.springframework.stereotype.Service;

/**
 *
 * @author marcelo
 */
@Service("fala")
public class Fala {

    public void falaOi(){
        System.out.println("Oi");
    }

}
