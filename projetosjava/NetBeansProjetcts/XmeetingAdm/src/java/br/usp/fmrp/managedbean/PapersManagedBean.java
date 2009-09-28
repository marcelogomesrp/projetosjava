/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.usp.fmrp.managedbean;

import br.usp.fmrp.entidades.Paper;
import br.usp.fmrp.service.Member1Service;
import br.usp.fmrp.service.PaperService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.model.ListDataModel;

/**
 *
 * @author marcelo
 */
public class PapersManagedBean {

    private PaperService paperService;
    private ListDataModel papers;



    public Integer getTamanhoLista() {
        try {
            return paperService.getQuantidadeDePaper();
        } catch (Exception ex) {
            Logger.getLogger(PapersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public ListDataModel getPapers() {
        try {
            this.papers = new ListDataModel((List) this.paperService.findAll());
        } catch (Exception ex) {
            Logger.getLogger(PapersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return papers;
    }

    public String getPostadoPor(){
        String autor = null;
        Paper paper = (Paper) this.papers.getRowData();
        Member1Service member1Service = new Member1Service();
        try {
            autor = member1Service.findById(paper.getMemberId()).getName();
        } catch (Exception ex) {
            System.out.println("Erro ao pegar o autor");
            Logger.getLogger(PapersManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return autor;
    }

    public PapersManagedBean() {
        this.paperService = new PaperService();
    }

    public String doListarPapers() {
        return "sucesso";
    }
}
