/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.service;

import br.com.marcelo.dao.ComputadorDao;
import br.com.marcelo.dao.impl.ComputadorDaoImpl;
import br.com.marcelo.entidades.Computador;
import java.util.List;

/**
 *
 * @author marcelo
 */
public class ComputadorService {
    ComputadorDao computadorDao;


    public ComputadorService() {
        this.computadorDao = new ComputadorDaoImpl();
    }

    public Computador salvar(Computador computador) throws Exception{
        Computador computadorSalvo = null;
        computadorSalvo = this.computadorDao.salvar(computador);
        return computadorSalvo;
    }

    public Computador findById(Long id) throws Exception{
        Computador computadorEncontrado = null;
        computadorEncontrado = this.computadorDao.findById(id);
        return computadorEncontrado;
    }

    public void remover(Computador computador) throws Exception{
        this.computadorDao.remover(computador);
    }

    public List<Computador> findAll() throws Exception {
        return computadorDao.findAll();
    }





}
