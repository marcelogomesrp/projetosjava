/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author marcelo
 */
public interface DaoGenerico<T,ID extends Serializable> {
    public T salvar(T object);
    public List<T> findAll();
    public void remover(T object);
}
