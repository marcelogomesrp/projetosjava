/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbean;

import negocio.modelo.Pesquisador;

/**
 *
 * @author marcelo
 */

public class PesquisadorManagedBean {

    private Pesquisador pesquisador = null;

    /** Creates a new instance of Pesquisador */
    public PesquisadorManagedBean() {
        //this.pesquisador = new Pesquisador();
    }

    /**
     * @return the pesquisador
     */
    public Pesquisador getPesquisador() {
        if(this.pesquisador == null){
            this.pesquisador = new Pesquisador();
        }
        return pesquisador;
    }

    /**
     * @param pesquisador the pesquisador to set
     */
    public void setPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }



}
