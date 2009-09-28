/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.managedbean;

import br.usp.fmrp.entidades.Member1;
import br.usp.fmrp.entidades.Paper;
import br.usp.fmrp.entidades.Trabalho;
import br.usp.fmrp.service.Member1Service;
import br.usp.fmrp.service.PaperService;
import br.usp.fmrp.service.TrabalhoService;
import br.usp.fmrp.util.FacesUtils;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;
import javax.servlet.http.HttpSession;

/**
 *
 * @author marcelo
 */

public class ParticipanteManagedBean {
    private Member1Service member1Service;
    private ListDataModel inscritos;
    private Member1 participante;
    private Collection<Paper> papers;
    private Collection<Trabalho> trabalhos;
    private String login;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    


    public String getLinkPdf(){
        return "http://lgmb.fmrp.usp.br/xmeeting2009/resumos/resumos/6/32ea51dec4edb6f9ed2f548a6cfa2a0e.pdf";
    }




    public Integer getTamanhoLista() {
        try {
            return member1Service.findAll().size();
        } catch (Exception ex) {
            Logger.getLogger(ParticipanteManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }



    public ListDataModel getInscritos() {
        try {
            //this.inscritos = (ListDataModel) member1Service.findAll();
            this.inscritos = new ListDataModel((List) this.member1Service.findAll());
            System.out.println("Tamanhooooooooooooooooo : " + inscritos.getRowCount());
        } catch (Exception ex) {
            System.out.println("Eroooooooooooooooooooooooooooooooooooooooo ao fazer conversao");
            Logger.getLogger(ParticipanteManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inscritos;
    }

    public String getEnvioPaper() {
        Integer quantidadeDePaper = 0;
        try {
            Member1 member = (Member1) this.inscritos.getRowData();
            PaperService paperService = new PaperService();
            quantidadeDePaper = paperService.listPaperbyMemberId(member.getId()).size();
        } catch (Exception ex) {
            System.out.println("Erooooooooooooooooooo ao pegar quantidade de paper");
            Logger.getLogger(ParticipanteManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(quantidadeDePaper > 0){
            return"Sim";
        }
        else{
            return "Não";
        }

    }
    
    
    public String getEnvioTrabalho() {
        Integer quantidadeDeTrabalho = 0 ;
        try{
            Member1 member1 = (Member1) this.inscritos.getRowData();
            TrabalhoService trabalhoService = new TrabalhoService();
            quantidadeDeTrabalho = trabalhoService.listTrabalhosbyMemberId(member1.getId()).size();
        }catch (Exception ex) {
            System.out.println("Erooooooooooooooooooo ao pegar quantidade de trabalho");
        }
        if(quantidadeDeTrabalho > 0){
            return "Sim";
        }else{
            return "Não";
        }
    }

    public ParticipanteManagedBean() {
        this.member1Service = new Member1Service();

        FacesContext fc = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
        this.login = (String) session.getAttribute("login");

        

    }


    public String doListarInscritos(){
        return "sucesso";
    }

    public String doEditar(){
        this.setParticipante((Member1) inscritos.getRowData());
        return "sucesso";
    }

    public Collection<Paper> getPapers() {
        return papers;
    }

    public void setPapers(Collection<Paper> papers) {
        this.papers = papers;
    }

    public Integer getPapersSize(){
        return papers.size();
    }
    public Integer getTrabalhosSize(){
        return trabalhos.size();
    }

    public Collection<Trabalho> getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(Collection<Trabalho> trabalhos) {
        this.trabalhos = trabalhos;
    }

    public Boolean getTemTrabalhos(){
        return true;
    }


    public String doDetalhes(){
        this.setParticipante((Member1) inscritos.getRowData());
        PaperService paperService = new PaperService();
        this.papers = paperService.listPaperbyMemberId(this.participante.getId());
        TrabalhoService trabalhoService = new TrabalhoService();
        this.trabalhos = trabalhoService.listTrabalhosbyMemberId(this.participante.getId());
        return "sucesso";
    }


    public String doPagar(){
        FacesUtils facesUtils = new FacesUtils();
        try {
            this.participante.setPagou(1);
            Member1 atualiza = this.member1Service.atualiza(this.getParticipante());
            facesUtils.mensErro("Pagamento confirmado");
        } catch (Exception ex) {
            facesUtils.mensErro("Erro ao confirmar pagamento");
            Logger.getLogger(ParticipanteManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "sucesso";
    }

    /**
     * @return the participante
     */
    public Member1 getParticipante() {
        return participante;
    }

    /**
     * @param participante the participante to set
     */
    public void setParticipante(Member1 participante) {
        this.participante = participante;
    }




}
