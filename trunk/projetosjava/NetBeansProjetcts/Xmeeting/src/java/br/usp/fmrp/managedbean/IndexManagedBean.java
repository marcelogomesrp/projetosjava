/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.managedbean;

import br.usp.fmrp.util.FacesUtils;

/**
 *
 * @author marcelo
 */

public class IndexManagedBean {

    private String nome;
    private String senha;


    
    public IndexManagedBean() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String doLogin(){
        if( (this.nome.equalsIgnoreCase("marcelo"))  &&
            (this.senha.equalsIgnoreCase("admin...")) ){
            return "sucesso";
        }else{
            FacesUtils facesUtils = new FacesUtils();
            facesUtils.mensInfo("Usuario ou senha inválido");
            return "falha";
        }
    }

}
