/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author marcelo
 */
public interface DaoGenerico <T,ID extends Serializable> {
    public T salvar(T object) throws Exception;
    public T atualizar(T object) throws Exception;
    public void remover(T object) throws Exception;
    public T findById(ID id) throws Exception;
    public List<T> findAll() throws Exception;
    public List<T> listPesq(String query);
    public List<T> pesqParam(String query, Map<String, Object> params);
}
