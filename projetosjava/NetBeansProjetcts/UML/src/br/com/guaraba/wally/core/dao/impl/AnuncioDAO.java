package br.com.guaraba.wally.core.dao.impl;

import br.com.guaraba.commons.dao.impl.DAOGenerico;
import br.com.guaraba.wally.core.dao.IAnuncioDAO;
import br.com.guaraba.wally.core.dominio.entidades.Anuncio;

public class AnuncioDAO extends DAOGenerico<Anuncio, Integer> implements IAnuncioDAO {

	public AnuncioDAO() {

		super(HibernateUtil.currentSession());
	}
}