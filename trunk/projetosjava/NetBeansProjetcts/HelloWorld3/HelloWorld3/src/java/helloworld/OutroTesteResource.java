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

public class OutroTesteResource {
    @Context
    private UriInfo context;
    private String valor = "uuu";

    /** Creates a new instance of OutroTesteResource */
    public OutroTesteResource() {
    }

    /**
     * Retrieves representation of an instance of helloworld.OutroTesteResource
     * @param name resource URI parameter
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText(@PathParam("name")
    String name) {
        //TODO return proper representation object
        this.valor = name;
        return "ok1";
    }

    /**
     * PUT method for updating or creating an instance of OutroTesteResource
     * @param name resource URI parameter
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(@PathParam("name")
    String name, String content) {
        this.valor = name;
    }

    /**
     * DELETE method for resource OutroTesteResource
     * @param name resource URI parameter
     */
    @DELETE
    public void delete(@PathParam("name")
    String name) {
    }
}
