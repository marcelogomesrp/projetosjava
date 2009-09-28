/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.managedbean;

import br.usp.fmrp.service.Member1Service;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.model.ListDataModel;

/**
 *
 * @author marcelo
 */

public class ListarInscritosManagedBean {
    private ListDataModel inscritos;
    private Member1Service member1Service;



    /** Creates a new instance of ListarInscritosManagedBean */
    public ListarInscritosManagedBean() {
        this.member1Service = new Member1Service();
    }


        public ListDataModel getInscritos() {


        try {
            this.inscritos = new ListDataModel((List) this.member1Service.findAll());
        } catch (Exception ex) {
            Logger.getLogger(ListarInscritosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inscritos;
    }

}
