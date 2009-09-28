package br.com.guaraba.wally.core.dominio.servicos;

import java.util.List;

import br.com.guaraba.commons.service.impl.ServiceException;
import br.com.guaraba.wally.core.dominio.entidades.Anuncio;

public interface IAnuncioService {

	Anuncio listarPorId(Integer id) throws ServiceException;

    Anuncio salvar(Anuncio anuncio) throws ServiceException;

    void excluir(Anuncio anuncio) throws ServiceException;

    List<Anuncio> listarTodos() throws ServiceException;
}