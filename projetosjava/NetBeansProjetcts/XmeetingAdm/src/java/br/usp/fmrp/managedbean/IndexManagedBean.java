/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.managedbean;

import br.usp.fmrp.util.FacesUtils;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author marcelo
 */

public class IndexManagedBean {
    private String login;
    private String senha;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }




    /** Creates a new instance of IndexManagedBean */
    public IndexManagedBean() {
    }
 
    public String DoLogin(){
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
        session.removeAttribute(login);
        session.setAttribute("login", this.login);
        if ( (this.login.equalsIgnoreCase("admin")) &&
             (this.senha.equalsIgnoreCase("lgmb2009")) ){
        return "sucesso";
        } else if ( (this.login.equalsIgnoreCase("meire")) &&
                    (this.senha.equalsIgnoreCase("fusca")) ){
            return "sucesso";
        }else {
            FacesUtils facesUtils = new FacesUtils();
            facesUtils.mensErro("Usuário ou senha inválido.");
            return "false";
        }
    }

}
