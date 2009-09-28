/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pacote;

import javax.el.ValueExpression;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;

/**
 *
 * @author marcelo
 */

public class Resposta {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String doSomeThink(){
        FacesContext ctx = FacesContext.getCurrentInstance();
        //this.nome = (String) ctx.getApplication().createValueBinding("#{Nome.valor}").getValue(ctx);
        ValueExpression ve = ctx.getApplication().getExpressionFactory().createValueExpression(ctx.getELContext(), "#{Nome}", Nome.class);
        Nome mm = (Nome) ve.getValue(ctx.getELContext());
        this.nome = mm.getValor();


        


        return "sucesso";
    }

    /** Creates a new instance of Resposta */
    public Resposta() {
    }

}
