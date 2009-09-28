/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author marcelo
 */

@Path("/outroTestes")
public class OutroTestesResource {
    @Context
    private UriInfo context;
    String valor;

    /** Creates a new instance of OutroTestesResource */
    public OutroTestesResource() {
        this.valor = "ttt";
    }

    /**
     * Retrieves representation of an instance of helloworld.OutroTestesResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        //TODO return proper representation object
        return "valor = " + this.valor;
    }

    /**
     * Sub-resource locator method for  {name}
     */
    @Path("{name}")
    public OutroTesteResource getOutroTesteResource() {
        return new OutroTesteResource();
    }
}
