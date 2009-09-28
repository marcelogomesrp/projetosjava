/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaaaaa;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "pesquisador")
@NamedQueries({@NamedQuery(name = "Pesquisador.findAll", query = "SELECT p FROM Pesquisador p"), @NamedQuery(name = "Pesquisador.findById", query = "SELECT p FROM Pesquisador p WHERE p.id = :id"), @NamedQuery(name = "Pesquisador.findByEmail", query = "SELECT p FROM Pesquisador p WHERE p.email = :email"), @NamedQuery(name = "Pesquisador.findByFone", query = "SELECT p FROM Pesquisador p WHERE p.fone = :fone"), @NamedQuery(name = "Pesquisador.findByNome", query = "SELECT p FROM Pesquisador p WHERE p.nome = :nome"), @NamedQuery(name = "Pesquisador.findBySenha", query = "SELECT p FROM Pesquisador p WHERE p.senha = :senha")}) 

// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.59F05DC8-F98A-1F2A-7376-568959452B17]
// </editor-fold> 
public class Pesquisador implements Serializable {

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3E62286B-92A0-1FCC-99DE-300F3760E228]
    // </editor-fold> 
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.67A66ACD-7A3C-4C4D-BED4-C4F6B05B4F61]
    // </editor-fold> 
    private Long id;
    @Column(name = "email")

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.180FBB18-7733-2AE7-A14A-7A3647BF57C3]
    // </editor-fold> 
    private String email;
    @Column(name = "fone")

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.A59B1637-3D73-3FBE-8E36-88C4AB643C9C]
    // </editor-fold> 
    private String fone;
    @Column(name = "nome")

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DA1A76AF-2A18-1BEB-981C-5DFA87DAEE75]
    // </editor-fold> 
    private String nome;
    @Column(name = "senha")

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.CA3710C8-26C6-7460-D83C-69F8A6E5A8CD]
    // </editor-fold> 
    private String senha;

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.3893D110-1937-84E3-CADD-9E46BAAEE281]
    // </editor-fold> 
    public Pesquisador () {
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E0B033F7-F715-538F-4E63-A18FBBD1980D]
    // </editor-fold> 
    public Pesquisador (Long id) {
        this.id = id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4CB6F044-04C9-050D-8053-FC7FE3C0382B]
    // </editor-fold> 
    public Long getId () {
        return id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.AE7F1C6A-DB04-1FD2-3ADD-A8B399281B50]
    // </editor-fold> 
    public void setId (Long id) {
        this.id = id;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8CED323A-28DF-AF4E-5CEE-FE2DF1C8CA76]
    // </editor-fold> 
    public String getEmail () {
        return email;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.C3AD0F71-100B-2DBF-60C7-003355D726E9]
    // </editor-fold> 
    public void setEmail (String email) {
        this.email = email;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.EE2628C2-D2C2-D1E8-E19D-9CB35A0CAD2E]
    // </editor-fold> 
    public String getFone () {
        return fone;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8B1A8E4D-D848-B4F0-159B-3E7AC4AA1860]
    // </editor-fold> 
    public void setFone (String fone) {
        this.fone = fone;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.610D5664-E7FA-AAF9-E0DE-3594D266295B]
    // </editor-fold> 
    public String getNome () {
        return nome;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.E54DE27C-BEF3-CA78-1184-AA9E55A280A3]
    // </editor-fold> 
    public void setNome (String nome) {
        this.nome = nome;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.4D3B0F10-10F2-0853-C4D6-0216C94F569B]
    // </editor-fold> 
    public String getSenha () {
        return senha;
    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.ED3C2753-9A12-7A07-D2DF-E4552A1D5193]
    // </editor-fold> 
    public void setSenha (String senha) {
        this.senha = senha;
    }

    @Override

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.DC184968-372E-FF0D-1AE8-CCD529925364]
    // </editor-fold> 
    public int hashCode () {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.589198CA-0632-447F-1962-36B3C09ACC3D]
    // </editor-fold> 
    public boolean equals (Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pesquisador)) {
            return false;
        }
        Pesquisador other = (Pesquisador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.D73D64FB-231C-BE3D-F23F-6DE88DAD0F27]
    // </editor-fold> 
    public String toString () {
        return "aaaaaa.Pesquisador[id=" + id + "]";
    }

}
