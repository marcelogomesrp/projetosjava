/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbean;


import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import negocio.modelo.Pesquisador;
import negocio.service.PesquisadorService;

/**
 *
 * @author marcelo
 */

public class LoginManagedBean {
    private PesquisadorManagedBean pesquisadorManagedBean;



    public LoginManagedBean() {
       // this.pesquisador = new Pesquisador();
    }

    public String entrar(){
        Pesquisador retorno = null;
        PesquisadorService pesquisadorService = new PesquisadorService();
        retorno = pesquisadorService.ListarPorUsuarioSenha(this.pesquisadorManagedBean.getPesquisador());
        if(retorno == null){
            FacesMessage fm = new FacesMessage("Senha inválida!");
            //FacesContext.getCurrentInstance().addMessage("senha", fm);
            FacesContext.getCurrentInstance().addMessage("erro", fm);
            return "falha";
        }
        return "sucesso";
    }

    /**
     * @return the pesquisadorManagedBean
     */
    public PesquisadorManagedBean getPesquisadorManagedBean() {
        return pesquisadorManagedBean;
    }

    /**
     * @param pesquisadorManagedBean the pesquisadorManagedBean to set
     */
    public void setPesquisadorManagedBean(PesquisadorManagedBean pesquisadorManagedBean) {
        this.pesquisadorManagedBean = pesquisadorManagedBean;
    }

}
