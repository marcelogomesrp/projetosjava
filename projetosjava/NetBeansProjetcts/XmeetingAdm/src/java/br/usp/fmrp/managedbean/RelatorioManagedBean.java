/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.managedbean;

import br.usp.fmrp.entidades.Member1;
import br.usp.fmrp.service.Member1Service;
import br.usp.fmrp.util.FacesUtils;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelo
 */

public class RelatorioManagedBean {
    private ArrayList<Member1> participantes;
    private FacesUtils facesUtils;
    private ArrayList<Facet> columns;

    public ArrayList<Facet> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<Facet> columns) {
        this.columns = columns;
    }


    

    public ArrayList<Member1> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Member1> participantes) {
        this.participantes = participantes;
    }



    public RelatorioManagedBean() {
        this.facesUtils = new FacesUtils();
    }



    public String doRelatorioPage(){
        this.participantes  = new ArrayList<Member1>();
        this.columns        = new ArrayList<Facet>();
        this.columns.clear();
        Facet facet = new Facet("nome","pe1");
        this.columns.add(facet);
        facet = new Facet("CPF","pe1");
        this.columns.add(facet);

        try {
            Member1Service member1Service = new Member1Service();
            this.participantes = (ArrayList<Member1>) member1Service.findAll();
             //this.participantes = new ArrayList<Member1>();
             
            return "sucesso";
        } catch (Exception ex) {
            this.facesUtils.mensErro("Erro ao montar o relatório");
            Logger.getLogger(RelatorioManagedBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "sucesso";
    }

}
