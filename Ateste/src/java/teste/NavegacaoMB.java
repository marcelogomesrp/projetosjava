/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.swing.JOptionPane;


/**
 *
 * @author marcelo
 *
 *@Named(value="navegacaoMB")
 *@SessionScoped
 * */

@ManagedBean(name="navegacaoMB")
@SessionScoped
public class NavegacaoMB {
    private String nome;

    /** Creates a new instance of NavegacaoMB */
    public NavegacaoMB() {
        nome = "Pessoa.xhtml";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Pessoa(){
        //JOptionPane.showMessageDialog(null, nome);
        this.setNome("Pessoa.xhtml");
    }
    public void Grupo(){
        //JOptionPane.showMessageDialog(null, nome);
        this.setNome("Grupo.xhtml");
    }


}
