/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.DELETE;

/**
 * REST Web Service
 *
 * @author marcelo
 */

public class BomDiaResource {
    @Context
    private UriInfo context;

    /** Creates a new instance of BomDiaResource */
    public BomDiaResource() {
    }

    /**
     * Retrieves representation of an instance of helloworld.BomDiaResource
     * @param nome resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText(@PathParam("nome")
    String nome) {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "Bom dia";
    }

    /**
     * PUT method for updating or creating an instance of BomDiaResource
     * @param nome resource URI parameter
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(@PathParam("nome")
    String nome, String content) {
        
    }

    /**
     * DELETE method for resource BomDiaResource
     * @param nome resource URI parameter
     */
    @DELETE
    public void delete(@PathParam("nome")
    String nome) {
    }
}
