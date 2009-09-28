/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package converter;

import helloworld.Computador;
import java.net.URI;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlAttribute;
import javax.ws.rs.core.UriBuilder;
import javax.persistence.EntityManager;

/**
 *
 * @author marcelo
 */

@XmlRootElement(name = "computador")
public class ComputadorConverter {
    private Computador entity;
    private URI uri;
    private int expandLevel;
  
    /** Creates a new instance of ComputadorConverter */
    public ComputadorConverter() {
        entity = new Computador();
    }

    /**
     * Creates a new instance of ComputadorConverter.
     *
     * @param entity associated entity
     * @param uri associated uri
     * @param expandLevel indicates the number of levels the entity graph should be expanded@param isUriExtendable indicates whether the uri can be extended
     */
    public ComputadorConverter(Computador entity, URI uri, int expandLevel, boolean isUriExtendable) {
        this.entity = entity;
        this.uri = (isUriExtendable) ? UriBuilder.fromUri(uri).path(entity.getId() + "/").build() : uri;
        this.expandLevel = expandLevel;
    }

    /**
     * Creates a new instance of ComputadorConverter.
     *
     * @param entity associated entity
     * @param uri associated uri
     * @param expandLevel indicates the number of levels the entity graph should be expanded
     */
    public ComputadorConverter(Computador entity, URI uri, int expandLevel) {
        this(entity, uri, expandLevel, false);
    }

    /**
     * Getter for id.
     *
     * @return value for id
     */
    @XmlElement
    public Long getId() {
        return (expandLevel > 0) ? entity.getId() : null;
    }

    /**
     * Setter for id.
     *
     * @param value the value to set
     */
    public void setId(Long value) {
        entity.setId(value);
    }

    /**
     * Getter for ip.
     *
     * @return value for ip
     */
    @XmlElement
    public String getIp() {
        return (expandLevel > 0) ? entity.getIp() : null;
    }

    /**
     * Setter for ip.
     *
     * @param value the value to set
     */
    public void setIp(String value) {
        entity.setIp(value);
    }

    /**
     * Getter for nome.
     *
     * @return value for nome
     */
    @XmlElement
    public String getNome() {
        return (expandLevel > 0) ? entity.getNome() : null;
    }

    /**
     * Setter for nome.
     *
     * @param value the value to set
     */
    public void setNome(String value) {
        entity.setNome(value);
    }

    /**
     * Getter for quantidadedememoria.
     *
     * @return value for quantidadedememoria
     */
    @XmlElement
    public Integer getQuantidadedememoria() {
        return (expandLevel > 0) ? entity.getQuantidadedememoria() : null;
    }

    /**
     * Setter for quantidadedememoria.
     *
     * @param value the value to set
     */
    public void setQuantidadedememoria(Integer value) {
        entity.setQuantidadedememoria(value);
    }

    /**
     * Getter for so.
     *
     * @return value for so
     */
    @XmlElement
    public String getSo() {
        return (expandLevel > 0) ? entity.getSo() : null;
    }

    /**
     * Setter for so.
     *
     * @param value the value to set
     */
    public void setSo(String value) {
        entity.setSo(value);
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
     * Sets the URI for this reference converter.
     *
     */
    public void setUri(URI uri) {
        this.uri = uri;
    }

    /**
     * Returns the Computador entity.
     *
     * @return an entity
     */
    @XmlTransient
    public Computador getEntity() {
        if (entity.getId() == null) {
            ComputadorConverter converter = UriResolver.getInstance().resolve(ComputadorConverter.class, uri);
            if (converter != null) {
                entity = converter.getEntity();
            }
        }
        return entity;
    }

    /**
     * Returns the resolved Computador entity.
     *
     * @return an resolved entity
     */
    public Computador resolveEntity(EntityManager em) {
        return entity;
    }
}
