/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbean;

/**
 *
 * @author marcelo
 */

public class ExibeManagedBean {

    private PessoaManagedBean pessoa;

    public PessoaManagedBean getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaManagedBean pessoa) {
        this.pessoa = pessoa;
    }

    
    

    /** Creates a new instance of ExibeManagedBean */
    public ExibeManagedBean() {
        
    }


    public String DoExibePage(){
        return "sucesso";
    }

}
