/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author marcelo
 */

public class ManagedBean {

    /** Creates a new instance of ManagedBean */
    public ManagedBean() {
    }

    public String doSomeThink(){
        //FacesUtils.mensErro("Aglum erro");
       FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "teste", null));
        return "sucesso";
    }

}
