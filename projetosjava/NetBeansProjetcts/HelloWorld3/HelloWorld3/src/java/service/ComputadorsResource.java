/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import helloworld.Computador;
import java.util.Collection;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import com.sun.jersey.api.core.ResourceContext;
import javax.persistence.EntityManager;
import converter.ComputadorsConverter;
import converter.ComputadorConverter;

/**
 *
 * @author marcelo
 */

@Path("/computadors/")
public class ComputadorsResource {
    @Context
    protected UriInfo uriInfo;
    @Context
    protected ResourceContext resourceContext;
  
    /** Creates a new instance of ComputadorsResource */
    public ComputadorsResource() {
    }

    /**
     * Get method for retrieving a collection of Computador instance in XML format.
     *
     * @return an instance of ComputadorsConverter
     */
    @GET
    @Produces({"application/xml", "application/json"})
    public ComputadorsConverter get(@QueryParam("start")
    @DefaultValue("0")
    int start, @QueryParam("max")
    @DefaultValue("10")
    int max, @QueryParam("expandLevel")
    @DefaultValue("1")
    int expandLevel, @QueryParam("query")
    @DefaultValue("SELECT e FROM Computador e")
    String query) {
        PersistenceService persistenceSvc = PersistenceService.getInstance();
        try {
            persistenceSvc.beginTx();
            return new ComputadorsConverter(getEntities(start, max, query), uriInfo.getAbsolutePath(), expandLevel);
        } finally {
            persistenceSvc.commitTx();
            persistenceSvc.close();
        }
    }

    /**
     * Post method for creating an instance of Computador using XML as the input format.
     *
     * @param data an ComputadorConverter entity that is deserialized from an XML stream
     * @return an instance of ComputadorConverter
     */
    @POST
    @Consumes({"application/xml", "application/json"})
    public Response post(ComputadorConverter data) {
        PersistenceService persistenceSvc = PersistenceService.getInstance();
        try {
            persistenceSvc.beginTx();
            EntityManager em = persistenceSvc.getEntityManager();
            Computador entity = data.resolveEntity(em);
            createEntity(data.resolveEntity(em));
            persistenceSvc.commitTx();
            return Response.created(uriInfo.getAbsolutePath().resolve(entity.getId() + "/")).build();
        } finally {
            persistenceSvc.close();
        }
    }

    /**
     * Returns a dynamic instance of ComputadorResource used for entity navigation.
     *
     * @return an instance of ComputadorResource
     */
    @Path("{id}/")
    public ComputadorResource getComputadorResource(@PathParam("id")
    Long id) {
        ComputadorResource resource = resourceContext.getResource(ComputadorResource.class);
        resource.setId(id);
        return resource;
    }

    /**
     * Returns all the entities associated with this resource.
     *
     * @return a collection of Computador instances
     */
    protected Collection<Computador> getEntities(int start, int max, String query) {
        EntityManager em = PersistenceService.getInstance().getEntityManager();
        return em.createQuery(query).setFirstResult(start).setMaxResults(max).getResultList();
    }

    /**
     * Persist the given entity.
     *
     * @param entity the entity to persist
     */
    protected void createEntity(Computador entity) {
        EntityManager em = PersistenceService.getInstance().getEntityManager();
        em.persist(entity);
    }
}
