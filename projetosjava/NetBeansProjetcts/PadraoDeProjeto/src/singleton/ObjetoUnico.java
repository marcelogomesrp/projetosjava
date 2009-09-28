/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton;

/**
 *
 * @author marcelo
 */
public class ObjetoUnico {
    private ObjetoUnico objetoUnico = null;

    public ObjetoUnico getObjetoUnico() {
        if(this.objetoUnico == null){
            this.objetoUnico = new ObjetoUnico();
        }
        return objetoUnico;
    }

    private ObjetoUnico() {
    }

}
