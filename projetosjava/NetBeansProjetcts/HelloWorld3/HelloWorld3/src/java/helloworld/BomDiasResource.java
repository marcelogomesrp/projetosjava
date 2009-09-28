/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

/**
 * REST Web Service
 *
 * @author marcelo
 */

@Path("/bomDias")
public class BomDiasResource {
    @Context
    private UriInfo context;
    private String nome;

    /** Creates a new instance of BomDiasResource */
    public BomDiasResource() {
    }

    /**
     * Retrieves representation of an instance of helloworld.BomDiasResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "ok - bom dia" + getBomDiaResource().getText("{nome}");
    }

    /**
     * POST method for creating an instance of BomDiasResource
     * @param content representation for the new resource
     * @return an HTTP response with content of the created resource
     */
    @POST
    @Consumes("text/plain")
    @Produces("text/plain")
    public Response postText(String content) {
       //this.nome = content;
        return Response.created(context.getAbsolutePath()).build();
    }

    /**
     * Sub-resource locator method for  {nome}
     */
    @Path("{nome}")
    public BomDiaResource getBomDiaResource() {
        return new BomDiaResource();
    }
}
