
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */

public class SaidaManagedBean {

    private String saida;

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public String doSaida(){
        //FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().put("nome", "marcelo");
        //this.saida = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("nome");

        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
        this.saida = (String) session.getAttribute("nome");

        return "ok";
    }

    /** Creates a new instance of SaidaManagedBean */
    public SaidaManagedBean() {
    }

}
