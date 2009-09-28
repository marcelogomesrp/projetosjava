/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testeboaspraticas;

import java.io.Serializable;

/**
 *
 * @author marcelo
 */
public class Usuario implements Serializable {
        private String nome;
        private Integer senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }

    @Override
    protected void finalize() throws Throwable {
            System.out.println("Objeto Finalizado: " + this.getNome());
            super.finalize();        
    }
}

