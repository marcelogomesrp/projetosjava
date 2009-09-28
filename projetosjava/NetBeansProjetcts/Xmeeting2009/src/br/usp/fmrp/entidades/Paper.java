/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "paper", catalog = "xmeeting2009", schema = "")
@NamedQueries({@NamedQuery(name = "Paper.findAll", query = "SELECT p FROM Paper p"), @NamedQuery(name = "Paper.findById", query = "SELECT p FROM Paper p WHERE p.id = :id"), @NamedQuery(name = "Paper.findByMemberId", query = "SELECT p FROM Paper p WHERE p.memberId = :memberId"), @NamedQuery(name = "Paper.findByTopicoId", query = "SELECT p FROM Paper p WHERE p.topicoId = :topicoId"), @NamedQuery(name = "Paper.findByStatus", query = "SELECT p FROM Paper p WHERE p.status = :status"), @NamedQuery(name = "Paper.findByFilename", query = "SELECT p FROM Paper p WHERE p.filename = :filename")})
public class Paper implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)    
    @ManyToOne
    private Participante membro;
    @Basic(optional = false)
    @Column(name = "topico_id", nullable = false)
    private int topicoId;
    @Basic(optional = false)
    @Column(name = "status", nullable = false)
    private int status;
    @Column(name = "filename", length = 200)
    private String filename;

    public Participante getMembro() {
        return membro;
    }

    public void setMembro(Participante membro) {
        this.membro = membro;
    }

    public Paper() {
    }

    public Paper(Integer id) {
        this.id = id;
    }

    public Paper(Integer id, Participante membro, int topicoId, int status) {
        this.id = id;
        this.membro = membro;
        this.topicoId = topicoId;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



    public int getTopicoId() {
        return topicoId;
    }

    public void setTopicoId(int topicoId) {
        this.topicoId = topicoId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paper)) {
            return false;
        }
        Paper other = (Paper) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.usp.fmrp.entidades.Paper[id=" + id + "]";
    }

}
