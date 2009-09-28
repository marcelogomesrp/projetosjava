/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package managedbean;

/**
 *
 * @author marcelo
 */

public class PessoaManagedBean {
    //private Pessoa pessoa = null;
    private Integer id;
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    


//    public Pessoa getPessoa() {
//        if(this.pessoa == null){
//            this.pessoa = new Pessoa();
//        }
//        return pessoa;
//    }
//
//    public void setPessoa(Pessoa pessoa) {
//        this.pessoa = pessoa;
//    }



}
