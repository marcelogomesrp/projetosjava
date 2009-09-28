/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converter;

import helloworld.Computador;
import java.net.URI;
import java.util.Collection;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.ArrayList;

/**
 *
 * @author marcelo
 */

@XmlRootElement(name = "computadors")
public class ComputadorsConverter {
    private Collection<Computador> entities;
    private Collection<ComputadorConverter> items;
    private URI uri;
    private int expandLevel;
  
    /** Creates a new instance of ComputadorsConverter */
    public ComputadorsConverter() {
    }

    /**
     * Creates a new instance of ComputadorsConverter.
     *
     * @param entities associated entities
     * @param uri associated uri
     * @param expandLevel indicates the number of levels the entity graph should be expanded
     */
    public ComputadorsConverter(Collection<Computador> entities, URI uri, int expandLevel) {
        this.entities = entities;
        this.uri = uri;
        this.expandLevel = expandLevel;
        getComputador();
    }

    /**
     * Returns a collection of ComputadorConverter.
     *
     * @return a collection of ComputadorConverter
     */
    @XmlElement
    public Collection<ComputadorConverter> getComputador() {
        if (items == null) {
            items = new ArrayList<ComputadorConverter>();
        }
        if (entities != null) {
            items.clear();
            for (Computador entity : entities) {
                items.add(new ComputadorConverter(entity, uri, expandLevel, true));
            }
        }
        return items;
    }

    /**
     * Sets a collection of ComputadorConverter.
     *
     * @param a collection of ComputadorConverter to set
     */
    public void setComputador(Collection<ComputadorConverter> items) {
        this.items = items;
    }

    /**
     * Returns the URI associated with this converter.
     *
     * @return the uri
     */
    @XmlAttribute
    public URI getUri() {
        return uri;
    }

    /**
     * Returns a collection Computador entities.
     *
     * @return a collection of Computador entities
     */
    @XmlTransient
    public Collection<Computador> getEntities() {
        entities = new ArrayList<Computador>();
        if (items != null) {
            for (ComputadorConverter item : items) {
                entities.add(item.getEntity());
            }
        }
        return entities;
    }
}
