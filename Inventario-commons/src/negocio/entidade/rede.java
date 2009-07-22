/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.entidade;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author marcelo
 */
@Entity
public class rede implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "gera_rede_id", sequenceName = "rede_sequences", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gera_rede_id")
    private Long id;
    private String dispositivo;
    private String ip;
    private String mascara;

    public String getAlias() {
        return dispositivo;
    }

    public void setAlias(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
