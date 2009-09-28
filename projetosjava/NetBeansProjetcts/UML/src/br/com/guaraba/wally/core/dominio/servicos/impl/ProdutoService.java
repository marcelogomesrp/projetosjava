package br.com.guaraba.wally.core.dominio.servicos.impl;

import java.util.List;

import br.com.guaraba.commons.dao.DataAccessException;
import br.com.guaraba.commons.service.impl.ServiceException;
import br.com.guaraba.wally.core.dao.IProdutoDAO;
import br.com.guaraba.wally.core.dao.impl.ProdutoDAO;
import br.com.guaraba.wally.core.dominio.entidades.Categoria;
import br.com.guaraba.wally.core.dominio.entidades.Fornecedor;
import br.com.guaraba.wally.core.dominio.entidades.Produto;
import br.com.guaraba.wally.core.dominio.servicos.IProdutoService;

public class ProdutoService implements IProdutoService {

    private IProdutoDAO produtoDAO = new ProdutoDAO();

    public Produto carregarPorId(Integer id) throws ServiceException {
    	
    	Produto produto = null;
    	
    	try {
    		
			produto = this.produtoDAO.carregarPorId(id);
			
		} catch (DataAccessException e) {

			throw new ServiceException("Ocorreu um erro ao tentar carregar o produto " + id, e);
		}

        return produto;
    }

    public Produto salvar(Produto produto) throws ServiceException {
   	
    	try {
   		
			produto = this.produtoDAO.salvar(produto);
		
		} catch (DataAccessException e) {

			throw new ServiceException("Ocorreu um erro ao tentar salvar o produto " + produto, e);
		}

        return produto;
    }

    public void excluir(Produto produto) throws ServiceException {
    	
        try {
        	
			this.produtoDAO.excluir(produto);
			
		} catch (DataAccessException e) {

			throw new ServiceException("Ocorreu um erro ao tentar excluir o produto " + produto, e);
		}
    }

    public List<Produto> findByFornecedorAndCategoria(Fornecedor fornecedor, Categoria categoria) throws ServiceException {
    	
    	List<Produto> produtos = null;
    	
    	try {
    		
			produtos = this.produtoDAO.FindProdutosByFornecedorAndCategoria(fornecedor, categoria);
			
		} catch (DataAccessException e) {

			throw new ServiceException("Ocorreu um erro ao tentar listar produtos por fornecedor e categoria ", e);
		}
    	
        return produtos;
    }

    public Iterable<Produto> findByFornecedor(Fornecedor fornecedor) throws ServiceException {
    	
        return fornecedor.getProdutos();
    }

    public Iterable<Produto> findByCategoria(Categoria categoria) throws ServiceException {
    	
        return categoria.getProdutos();
    }

    public List<Produto> listarTodos() throws ServiceException {
   	
    	List<Produto> produtos = null;
   	
    	try {
   		
			produtos = this.produtoDAO.listarTodos();
		
		} catch (DataAccessException e) {
	
			throw new ServiceException("Ocorreu um erro ao tentar listar todos os produtos", e);
		}

        return produtos;
    }
}