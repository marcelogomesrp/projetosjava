/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.managedbean;

import br.com.marcelo.dao.PesquisadorDao;
import br.com.marcelo.dao.imp.PesquisadorDaoImp;
import br.com.marcelo.entities.Pesquisador;
import br.com.marcelo.service.PesquisadorService;
import br.com.marcelo.util.FacesUtils;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author marcelo
 */

public class PesquisadorManagedBean {
    PesquisadorService pesquisadorService;
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private Long id;

    /** Creates a new instance of PesquisadorManagedBean */
    public PesquisadorManagedBean() {
        pesquisadorService = new PesquisadorService();
    }

    public String doGravar(){
        Pesquisador pesquisador = new Pesquisador();
        pesquisador.setId(this.id);
        pesquisador.setNome(this.nome);
      //  Pesquisador resultado  = this.pesquisadorService.salvar(pesquisador);
        PesquisadorDao pesquisadorDao = new PesquisadorDaoImp();
        try{
            Pesquisador pp = pesquisadorDao.salvar(pesquisador);
            pesquisador = null;
            this.id = null;
            this.nome = null;
          FacesContext.getCurrentInstance().addMessage("invalido",  new FacesMessage("Cadastro efetuado com sucesso"));
        }catch(Exception e){
            //FacesContext.getCurrentInstance().addMessage("invalido",  new FacesMessage("Erro ao processar a sua solicitação"));
            FacesUtils facesUtils = new FacesUtils();
            facesUtils.mensErro("erroooooooooooooooooooooooooooooooooooooooooo puts...");
        }

        return "sucesso";
    }


    public String doExcluir(){
        FacesUtils facesUtils = new FacesUtils();
        Pesquisador pesquisador = new Pesquisador();
        pesquisador.setId(this.getId());
        PesquisadorDao pesquisadorDao = new PesquisadorDaoImp();
        pesquisadorDao.remover(pesquisador);
        facesUtils.mensErro("Pesquisador removido com sucesso");
        return "sucesso";

    }


}
