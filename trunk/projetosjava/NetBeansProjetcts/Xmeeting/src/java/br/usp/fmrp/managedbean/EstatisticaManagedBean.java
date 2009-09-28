/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.managedbean;

import br.usp.fmrp.service.ParticipanteService;
import br.usp.fmrp.service.PaperService;
import br.usp.fmrp.service.TrabalhoService;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.ajax4jsf.resource.image.Quantize;

/**
 *
 * @author marcelo
 */

public class EstatisticaManagedBean {
    ParticipanteService member1Service;
    TrabalhoService trabalhoService;
    PaperService paperService;



    
    public EstatisticaManagedBean() {
        this.member1Service     = new ParticipanteService();
        this.trabalhoService    = new TrabalhoService();
        this.paperService       = new PaperService();
    }   

    public String getQuantidadeDeInscritos(){
        Integer quantidadeDeInscritos = null;
        try {
             quantidadeDeInscritos = this.member1Service.getQuantidadeDeInscritos();
        } catch (Exception ex) {
            Logger.getLogger(EstatisticaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return String.valueOf(quantidadeDeInscritos);
    }

    public String doEstatistica(){
        return "sucesso";
    }

    public String getquantidadeDeDocumentos(){
        Integer quantidadeDeDocumentos = null;
        try {
            quantidadeDeDocumentos = this.trabalhoService.getQuantidadeDeInscritos();
        } catch (Exception ex) {
            Logger.getLogger(EstatisticaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quantidadeDeDocumentos.toString();
    }

    public String getQuantidadeDePaper(){
        Integer quantidadeDePaper = null;
        try {
            quantidadeDePaper = this.paperService.getQuantidadeDePaper();
        } catch (Exception ex) {
            Logger.getLogger(EstatisticaManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quantidadeDePaper.toString();
    }

}
