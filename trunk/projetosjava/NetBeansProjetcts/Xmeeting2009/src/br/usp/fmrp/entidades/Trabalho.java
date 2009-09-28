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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "trabalho", catalog = "xmeeting2009", schema = "")
@NamedQueries({@NamedQuery(name = "Trabalho.findAll", query = "SELECT t FROM Trabalho t"), @NamedQuery(name = "Trabalho.findById", query = "SELECT t FROM Trabalho t WHERE t.id = :id"), @NamedQuery(name = "Trabalho.findByTopicoId", query = "SELECT t FROM Trabalho t WHERE t.topicoId = :topicoId"), @NamedQuery(name = "Trabalho.findByMemberId", query = "SELECT t FROM Trabalho t WHERE t.memberId = :memberId"), @NamedQuery(name = "Trabalho.findByTitulo", query = "SELECT t FROM Trabalho t WHERE t.titulo = :titulo"), @NamedQuery(name = "Trabalho.findByCcountStatus", query = "SELECT t FROM Trabalho t WHERE t.ccountStatus = :ccountStatus"), @NamedQuery(name = "Trabalho.findByViewPdf", query = "SELECT t FROM Trabalho t WHERE t.viewPdf = :viewPdf"), @NamedQuery(name = "Trabalho.findByStatus", query = "SELECT t FROM Trabalho t WHERE t.status = :status"), @NamedQuery(name = "Trabalho.findByConcorrerOral", query = "SELECT t FROM Trabalho t WHERE t.concorrerOral = :concorrerOral"), @NamedQuery(name = "Trabalho.findByChars", query = "SELECT t FROM Trabalho t WHERE t.chars = :chars"), @NamedQuery(name = "Trabalho.findByPdfName", query = "SELECT t FROM Trabalho t WHERE t.pdfName = :pdfName"), @NamedQuery(name = "Trabalho.findByTrabNum", query = "SELECT t FROM Trabalho t WHERE t.trabNum = :trabNum"), @NamedQuery(name = "Trabalho.findByMedia", query = "SELECT t FROM Trabalho t WHERE t.media = :media"), @NamedQuery(name = "Trabalho.findByToplist", query = "SELECT t FROM Trabalho t WHERE t.toplist = :toplist")})
public class Trabalho implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "topico_id", nullable = false)
    private int topicoId;
    @Basic(optional = false)
    @Column(name = "member_id", nullable = false)
    private int memberId;
    @Basic(optional = false)
    @Column(name = "titulo", nullable = false, length = 250)
    private String titulo;
    @Basic(optional = false)
    @Lob
    @Column(name = "resumo", nullable = false, length = 2147483647)
    private String resumo;
    @Basic(optional = false)
    @Column(name = "ccount_status", nullable = false)
    private int ccountStatus;
    @Basic(optional = false)
    @Column(name = "viewPdf", nullable = false)
    private int viewPdf;
    @Basic(optional = false)
    @Column(name = "status", nullable = false)
    private int status;
    @Basic(optional = false)
    @Column(name = "concorrer_oral", nullable = false, length = 10)
    private String concorrerOral;
    @Basic(optional = false)
    @Column(name = "chars", nullable = false)
    private int chars;
    @Basic(optional = false)
    @Column(name = "pdf_name", nullable = false, length = 100)
    private String pdfName;
    @Basic(optional = false)
    @Column(name = "trab_num", nullable = false)
    private int trabNum;
    @Column(name = "media", length = 10)
    private String media;
    @Column(name = "toplist")
    private Integer toplist;

    public Trabalho() {
    }

    public Trabalho(Integer id) {
        this.id = id;
    }

    public Trabalho(Integer id, int topicoId, int memberId, String titulo, String resumo, int ccountStatus, int viewPdf, int status, String concorrerOral, int chars, String pdfName, int trabNum) {
        this.id = id;
        this.topicoId = topicoId;
        this.memberId = memberId;
        this.titulo = titulo;
        this.resumo = resumo;
        this.ccountStatus = ccountStatus;
        this.viewPdf = viewPdf;
        this.status = status;
        this.concorrerOral = concorrerOral;
        this.chars = chars;
        this.pdfName = pdfName;
        this.trabNum = trabNum;
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

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getCcountStatus() {
        return ccountStatus;
    }

    public void setCcountStatus(int ccountStatus) {
        this.ccountStatus = ccountStatus;
    }

    public int getViewPdf() {
        return viewPdf;
    }

    public void setViewPdf(int viewPdf) {
        this.viewPdf = viewPdf;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getConcorrerOral() {
        return concorrerOral;
    }

    public void setConcorrerOral(String concorrerOral) {
        this.concorrerOral = concorrerOral;
    }

    public int getChars() {
        return chars;
    }

    public void setChars(int chars) {
        this.chars = chars;
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName;
    }

    public int getTrabNum() {
        return trabNum;
    }

    public void setTrabNum(int trabNum) {
        this.trabNum = trabNum;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public Integer getToplist() {
        return toplist;
    }

    public void setToplist(Integer toplist) {
        this.toplist = toplist;
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
        if (!(object instanceof Trabalho)) {
            return false;
        }
        Trabalho other = (Trabalho) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.usp.fmrp.entidades.Trabalho[id=" + id + "]";
    }

}
