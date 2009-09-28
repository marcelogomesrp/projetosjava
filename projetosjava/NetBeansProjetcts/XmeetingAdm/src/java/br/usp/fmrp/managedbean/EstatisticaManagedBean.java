/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.managedbean;

import br.usp.fmrp.entidades.Member1;
import br.usp.fmrp.service.Member1Service;
import br.usp.fmrp.service.PaperService;
import br.usp.fmrp.service.TrabalhoService;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelo
 */

public class EstatisticaManagedBean {
    private String quantidadeDePaper;
    private String quantidadeDeTrabalho;
    private String quantidadeDeParticipante;
    private String valorRecebido;
    private String valorTotal;

    public String getValorTotal() {
        Member1Service member1Service = new Member1Service();
        Float valor = Float.valueOf(0);
        try {
            for (Member1 member1 : member1Service.findAll()) {
                valor += Float.valueOf(member1.getValorinsc());
            }
        } catch (Exception ex) {
            Logger.getLogger(EstatisticaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.valorTotal = String.valueOf(valor);
        return valorTotal;
    }

    public String getValorRecebido() {
        Member1Service member1Service = new Member1Service();
        Float valor = Float.valueOf(0);
        try {
            for (Member1 member1 : member1Service.findAll()) {
                if(member1.getPagou() == 1){
                    valor += Float.valueOf(member1.getValorinsc());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(EstatisticaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.valorRecebido = String.valueOf(valor);
        return valorRecebido;
    }




//    public String getValorTotal() {
//        Member1Service member1Service = new Member1Service();
//        Float valor = Float.valueOf(0);
//        try {
//
//            for (Member1 member1 : member1Service.findAll()) {
//                valor += Float.valueOf(member1.getValorinsc());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(EstatisticaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return String.valueOf(valor);
//    }

    public String getValorPago() {
        return null;
    }




    public String getQuantidadeDePaper() {
        try {
            PaperService paperService = new PaperService();
            this.quantidadeDePaper = String.valueOf(paperService.findAll().size());
        } catch (Exception ex) {
            Logger.getLogger(EstatisticaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quantidadeDePaper;
    }

    public String getQuantidadeDeParticipante() {
        Member1Service member1Service = new Member1Service();
        try {
            this.quantidadeDeParticipante = String.valueOf(member1Service.getQuantidadeDeInscritos());
        } catch (Exception ex) {
            Logger.getLogger(EstatisticaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quantidadeDeParticipante;
    }

    public String getQuantidadeDeTrabalho() {
        TrabalhoService trabalhoService = new TrabalhoService();
        try {
            this.quantidadeDeTrabalho = String.valueOf(trabalhoService.getQuantidadeDeInscritos());
        } catch (Exception ex) {
            Logger.getLogger(EstatisticaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quantidadeDeTrabalho;
    }


    public String doEstatistica(){
        return "sucesso";
    }


    public EstatisticaManagedBean() {
    }

}
