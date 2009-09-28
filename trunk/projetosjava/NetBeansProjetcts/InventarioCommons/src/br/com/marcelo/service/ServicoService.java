/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marcelo.service;

import br.com.marcelo.dao.ServicoDao;
import br.com.marcelo.dao.impl.ServicoDaoImpl;
import br.com.marcelo.entidades.Servico;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelo
 */
public class ServicoService {

    private Servico servico;
    private ServicoDao servicoDao;

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public ServicoService() {
        this.servicoDao = new ServicoDaoImpl();
    }

    private ServicoDao getServicoDao() {
        return servicoDao;
    }

    private Servico Salvar(Servico servico){
        Servico retorno = null;
        try {
            retorno = this.servicoDao.salvar(servico);
        } catch (Exception ex) {
            new Throwable("Erro ao salvar servico");
            Logger.getLogger(ServicoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
