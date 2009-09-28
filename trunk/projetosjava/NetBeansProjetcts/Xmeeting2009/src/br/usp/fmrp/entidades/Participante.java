/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "participante", catalog = "xmeeting2009", schema = "", uniqueConstraints = {@UniqueConstraint(columnNames = {"email"}), @UniqueConstraint(columnNames = {"login"}), @UniqueConstraint(columnNames = {"cpf"})})
@NamedQueries({@NamedQuery(name = "Participante.findAll", query = "SELECT m FROM Participante m"),
                @NamedQuery(name = "Participante.findById", query = "SELECT m FROM Participante m WHERE m.id = :id"),
                @NamedQuery(name = "Participante.findByCpf", query = "SELECT m FROM Participante m WHERE m.cpf = :cpf"),
                @NamedQuery(name = "Participante.findByLogin", query = "SELECT m FROM Participante m WHERE m.login = :login"),
                @NamedQuery(name = "Participante.findByEmail", query = "SELECT m FROM Participante m WHERE m.email = :email"),
                @NamedQuery(name = "Participante.findByName", query = "SELECT m FROM Participante m WHERE m.name = :name"),
                @NamedQuery(name = "Participante.findByNamecracha", query = "SELECT m FROM Participante m WHERE m.namecracha = :namecracha"),
                @NamedQuery(name = "Participante.findByRg", query = "SELECT m FROM Participante m WHERE m.rg = :rg"),
                @NamedQuery(name = "Participante.findByPass", query = "SELECT m FROM Participante m WHERE m.pass = :pass"),
                @NamedQuery(name = "Participante.findByAddress", query = "SELECT m FROM Participante m WHERE m.address = :address"),
                @NamedQuery(name = "Participante.findByNeighborhood", query = "SELECT m FROM Participante m WHERE m.neighborhood = :neighborhood"),
                @NamedQuery(name = "Participante.findByCity", query = "SELECT m FROM Participante m WHERE m.city = :city"),
                @NamedQuery(name = "Participante.findByState", query = "SELECT m FROM Participante m WHERE m.state = :state"),
                @NamedQuery(name = "Participante.findByNationality", query = "SELECT m FROM Participante m WHERE m.nationality = :nationality"),
                @NamedQuery(name = "Participante.findByZipcode", query = "SELECT m FROM Participante m WHERE m.zipcode = :zipcode"),
                @NamedQuery(name = "Participante.findByTelephone", query = "SELECT m FROM Participante m WHERE m.telephone = :telephone"),
                @NamedQuery(name = "Participante.findByCell", query = "SELECT m FROM Participante m WHERE m.cell = :cell"),
                @NamedQuery(name = "Participante.findByFax", query = "SELECT m FROM Participante m WHERE m.fax = :fax"),
                @NamedQuery(name = "Participante.findByOccupation", query = "SELECT m FROM Participante m WHERE m.occupation = :occupation"),
                @NamedQuery(name = "Participante.findByExpertise", query = "SELECT m FROM Participante m WHERE m.expertise = :expertise"),
                @NamedQuery(name = "Participante.findByInstitution", query = "SELECT m FROM Participante m WHERE m.institution = :institution"),
                @NamedQuery(name = "Participante.findByTipo", query = "SELECT m FROM Participante m WHERE m.tipo = :tipo"),
                @NamedQuery(name = "Participante.findByDatainsc", query = "SELECT m FROM Participante m WHERE m.datainsc = :datainsc"),
                @NamedQuery(name = "Participante.findByPagou", query = "SELECT m FROM Participante m WHERE m.pagou = :pagou"),
                @NamedQuery(name = "Participante.findByDatapagto", query = "SELECT m FROM Participante m WHERE m.datapagto = :datapagto"),
                @NamedQuery(name = "Participante.findByCourse", query = "SELECT m FROM Participante m WHERE m.course = :course"),
                @NamedQuery(name = "Participante.findByValorinsc", query = "SELECT m FROM Participante m WHERE m.valorinsc = :valorinsc"),
                @NamedQuery(name = "Participante.findByAb3cmember", query = "SELECT m FROM Participante m WHERE m.ab3cmember = :ab3cmember"),
                @NamedQuery(name = "Participante.findByCategoryType", query = "SELECT m FROM Participante m WHERE m.categoryType = :categoryType"),
                @NamedQuery(name = "Participante.findByUserKey", query = "SELECT m FROM Participante m WHERE m.userKey = :userKey")})
                
public class Participante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cpf", nullable = false, length = 14)
    private String cpf;
    @Basic(optional = false)
    @Column(name = "login", nullable = false, length = 12)
    private String login;
    @Basic(optional = false)
    @Column(name = "email", nullable = false, length = 60)
    private String email;
    @Column(name = "name", length = 60)
    private String name;
    @Column(name = "namecracha", length = 15)
    private String namecracha;
    @Column(name = "rg", length = 15)
    private String rg;
    @Column(name = "pass", length = 12)
    private String pass;
    @Column(name = "address", length = 80)
    private String address;
    @Column(name = "neighborhood", length = 40)
    private String neighborhood;
    @Column(name = "city", length = 60)
    private String city;
    @Column(name = "uf", length = 60)
    private String uf;
    @Column(name = "nationality", length = 40)
    private String nationality;
    @Column(name = "zipcode", length = 15)
    private String zipcode;
    @Column(name = "telephone", length = 22)
    private String telephone;
    @Column(name = "cell", length = 22)
    private String cell;
    @Column(name = "fax", length = 22)
    private String fax;
    @Column(name = "occupation", length = 60)
    private String occupation;
    @Column(name = "expertise", length = 60)
    private String expertise;
    @Column(name = "institution", length = 60)
    private String institution;
    @Column(name = "tipo")
    private Integer tipo;
    @Column(name = "datainsc", length = 10)
    private String datainsc;
    @Column(name = "pagou")
    private Integer pagou;
    @Column(name = "datapagto", length = 10)
    private String datapagto;
    @Column(name = "course")
    private Integer course;
    @Column(name = "valorinsc", length = 10)
    private String valorinsc;
    @Column(name = "ab3cmember", length = 20)
    private String ab3cmember;
    @Column(name = "category_type")
    private Integer categoryType;
    @Column(name = "userKey", length = 50)
    private String userKey;
    @OneToMany(mappedBy = "membro")
    private List<Paper> papers;

    public Participante() {
    }

    public Participante(Integer id) {
        this.id = id;
    }

    public Participante(Integer id, String cpf, String login, String email) {
        this.id = id;
        this.cpf = cpf;
        this.login = login;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamecracha() {
        return namecracha;
    }

    public void setNamecracha(String namecracha) {
        this.namecracha = namecracha;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getDatainsc() {
        return datainsc;
    }

    public void setDatainsc(String datainsc) {
        this.datainsc = datainsc;
    }

    public Integer getPagou() {
        return pagou;
    }

    public void setPagou(Integer pagou) {
        this.pagou = pagou;
    }

    public String getDatapagto() {
        return datapagto;
    }

    public void setDatapagto(String datapagto) {
        this.datapagto = datapagto;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getValorinsc() {
        return valorinsc;
    }

    public void setValorinsc(String valorinsc) {
        this.valorinsc = valorinsc;
    }

    public String getAb3cmember() {
        return ab3cmember;
    }

    public void setAb3cmember(String ab3cmember) {
        this.ab3cmember = ab3cmember;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
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
        if (!(object instanceof Participante)) {
            return false;
        }
        Participante other = (Participante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.usp.fmrp.entidades.Participante[id=" + id + "]";
    }

    /**
     * @return the papers
     */
    public List<Paper> getPapers() {
        return papers;
    }

    /**
     * @param papers the papers to set
     */
    public void setPapers(List<Paper> papers) {
        this.papers = papers;
    }

}
