package br.com.guaraba.wally.core.dominio.servicos.impl;

import java.util.List;

import br.com.guaraba.commons.dao.DataAccessException;
import br.com.guaraba.commons.service.impl.ServiceException;
import br.com.guaraba.wally.core.dao.IAnuncioDAO;
import br.com.guaraba.wally.core.dao.impl.AnuncioDAO;
import br.com.guaraba.wally.core.dominio.entidades.Anuncio;
import br.com.guaraba.wally.core.dominio.servicos.IAnuncioService;

public class AnuncioService implements IAnuncioService {

    private IAnuncioDAO anuncioDAO;

    public AnuncioService() {

        this.anuncioDAO = new AnuncioDAO();
    }

    public Anuncio listarPorId(Integer id) throws ServiceException {

    	Anuncio anuncio = null;

    	try {

			anuncio = this.anuncioDAO.carregarPorId(id);

		} catch (DataAccessException e) {

			throw new ServiceException("Ocorreu um erro ao tentar carregar um anuncio com o id " + id, e);
		}

        return anuncio;
    }

    public Anuncio salvar(Anuncio anuncio) throws ServiceException {
    	
    	try {

			anuncio = this.anuncioDAO.salvar(anuncio);

		} catch (DataAccessException e) {

			throw new ServiceException("Ocorreu um erro ao tentar salvar o anuncio " + anuncio, e);
		}

        return anuncio;
    }

    public void excluir(Anuncio anuncio) throws ServiceException {
    	
    	try {

			anuncio = this.anuncioDAO.excluir(anuncio);

		} catch (DataAccessException e) {

			throw new ServiceException("Ocorreu um erro ao tentar excluir o anuncio " + anuncio, e);
		}
    }

    public List<Anuncio> listarTodos() throws ServiceException {
        
    	List<Anuncio> anuncios = null;
    	
    	try {

    		anuncios = this.anuncioDAO.listarTodos();

		} catch (DataAccessException e) {

			throw new ServiceException("Ocorreu um erro ao tentar listar todos os anuncios.", e);
		}

        return anuncios;
    }
}