
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

public class IndexManagedBean {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String doNovo(){
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
        session.setAttribute("nome", this.nome);
        return "sucesso";
    }

    /** Creates a new instance of IndexManagedBean */
    public IndexManagedBean() {
    }

}
