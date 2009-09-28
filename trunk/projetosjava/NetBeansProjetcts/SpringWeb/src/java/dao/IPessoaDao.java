/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entidade.Pessoa;

/**
 *
 * @author marcelo
 */
public interface IPessoaDao {

    String getNome();

    void setNome(String nome);
    public void gravar(Pessoa pessoa);
    public void persist(Object object);

}
