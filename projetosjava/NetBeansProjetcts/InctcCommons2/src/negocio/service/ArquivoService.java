/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.service;

import negocio.entidade.Arquivo;
import persistencia.ArquivoDao;
import persistencia.jpa.ArquivoDaoJpa;

/**
 *
 * @author marcelo
 */
public class ArquivoService {
    ArquivoDao arquivoDao;

    public ArquivoService() {
        this.arquivoDao = new ArquivoDaoJpa();
    }

    public Arquivo gravar(Arquivo arquivo){
        return this.arquivoDao.salvar(arquivo);
    }

}
