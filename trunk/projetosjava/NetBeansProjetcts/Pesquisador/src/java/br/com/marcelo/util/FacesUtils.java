/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author marcelo
 */
public class FacesUtils {

    public void mensInfo(String message){
        mensagem(message, FacesMessage.SEVERITY_INFO);
    }

    public void mensErro(String message){
        mensagem(message, FacesMessage.SEVERITY_ERROR);
    }

    public void mensagem(String message, FacesMessage.Severity severity){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severity, message, null));
    }

}
