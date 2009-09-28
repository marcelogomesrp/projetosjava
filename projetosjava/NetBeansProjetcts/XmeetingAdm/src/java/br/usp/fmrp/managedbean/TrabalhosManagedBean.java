/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.managedbean;

import br.usp.fmrp.entidades.Member1;
import br.usp.fmrp.entidades.Trabalho;
import br.usp.fmrp.service.Member1Service;
import br.usp.fmrp.service.TrabalhoService;
import br.usp.fmrp.util.FacesUtils;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.model.ListDataModel;

/**
 *
 * @author marcelo
 */



public class TrabalhosManagedBean {
    private TrabalhoService trabalhoService;
    private ListDataModel trabalhos;
    private String autor = null;


public String aprovarTrabalho(){
    FacesUtils facesUtils = new FacesUtils();
        try {
            Trabalho trabalho = (Trabalho) trabalhos.getRowData();
            trabalho.setAprovado(Boolean.TRUE);
            this.trabalhoService.atualizarTrabalho(trabalho);
            facesUtils.mensInfo("Trabalho " + trabalho.getTitulo() + "Aprovado com sucesso");
        } catch (Exception ex) {
            facesUtils.mensInfo("Ocorreu um erro ao aprovar o trabalho");
            Logger.getLogger(TrabalhosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    return "sucesso";
}

public String getLinkPdf(){
        Trabalho trabalho = (Trabalho) trabalhos.getRowData();
        return "http://lgmb.fmrp.usp.br/xmeeting2009/resumos/resumos/" + trabalho.getId() + "/" + trabalho.getPdfName() +".pdf";
}

//   public String getStatus(){
//       Trabalho t = (Trabalho)this.getTrabalhos().getRowData();
//       if(t.getStatus() == 1){
//           return "finalizado";
//       }else {
//           return "Enviado";
//       }
//
//   }
    



    public Integer getTamanhoLista() {
        try {
            return trabalhoService.getQuantidadeDeInscritos();
        } catch (Exception ex) {
            Logger.getLogger(TrabalhosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }


    public ListDataModel getTrabalhos() {
        try {
            this.trabalhos = new ListDataModel((List) this.trabalhoService.findAll());
        } catch (Exception ex) {
            Logger.getLogger(TrabalhosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return trabalhos;
    }

    public String getAutor() {
        Trabalho trabalho = (Trabalho) this.trabalhos.getRowData();
        this.autor = String.valueOf(trabalho.getMemberId());
        Member1Service member1Service = new Member1Service();
        try {
            Member1 member = member1Service.findById(trabalho.getMemberId());
            this.autor = member.getName();
        } catch (Exception ex) {
            Logger.getLogger(TrabalhosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return autor;
    }

    

//    public String getPostadoPor(){
//        String autor  = null;
//        Trabalho trabalho = (Trabalho) this.trabalhos.getRowData();
//        Member1Service member1Service = new Member1Service();
//        Member1 member = null;
//        try {
//            member = member1Service.findById(trabalho.getId());
//            autor = member.getName();
//        } catch (Exception ex) {
//            Logger.getLogger(TrabalhosManagedBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return trabalho.getId() + " - " + member.getId() + " - " + autor;
//    }





    /** Creates a new instance of TrabalhosManagedBean */
    public TrabalhosManagedBean() {
        this.trabalhoService = new TrabalhoService();



    }

    public String doListarTrabalhos(){
        return "sucesso";
    }

}
