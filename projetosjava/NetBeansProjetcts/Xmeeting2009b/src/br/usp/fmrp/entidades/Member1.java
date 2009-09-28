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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "member")
@NamedQueries({@NamedQuery(name = "Member1.findAll", query = "SELECT m FROM Member1 m"), @NamedQuery(name = "Member1.findById", query = "SELECT m FROM Member1 m WHERE m.id = :id"), @NamedQuery(name = "Member1.findByCpf", query = "SELECT m FROM Member1 m WHERE m.cpf = :cpf"), @NamedQuery(name = "Member1.findByLogin", query = "SELECT m FROM Member1 m WHERE m.login = :login"), @NamedQuery(name = "Member1.findByEmail", query = "SELECT m FROM Member1 m WHERE m.email = :email"), @NamedQuery(name = "Member1.findByName", query = "SELECT m FROM Member1 m WHERE m.name = :name"), @NamedQuery(name = "Member1.findByNamecracha", query = "SELECT m FROM Member1 m WHERE m.namecracha = :namecracha"), @NamedQuery(name = "Member1.findByRg", query = "SELECT m FROM Member1 m WHERE m.rg = :rg"), @NamedQuery(name = "Member1.findByPass", query = "SELECT m FROM Member1 m WHERE m.pass = :pass"), @NamedQuery(name = "Member1.findByAddress", query = "SELECT m FROM Member1 m WHERE m.address = :address"), @NamedQuery(name = "Member1.findByNeighborhood", query = "SELECT m FROM Member1 m WHERE m.neighborhood = :neighborhood"), @NamedQuery(name = "Member1.findByCity", query = "SELECT m FROM Member1 m WHERE m.city = :city"), @NamedQuery(name = "Member1.findByState", query = "SELECT m FROM Member1 m WHERE m.state = :state"), @NamedQuery(name = "Member1.findByNationality", query = "SELECT m FROM Member1 m WHERE m.nationality = :nationality"), @NamedQuery(name = "Member1.findByZipcode", query = "SELECT m FROM Member1 m WHERE m.zipcode = :zipcode"), @NamedQuery(name = "Member1.findByTelephone", query = "SELECT m FROM Member1 m WHERE m.telephone = :telephone"), @NamedQuery(name = "Member1.findByCell", query = "SELECT m FROM Member1 m WHERE m.cell = :cell"), @NamedQuery(name = "Member1.findByFax", query = "SELECT m FROM Member1 m WHERE m.fax = :fax"), @NamedQuery(name = "Member1.findByOccupation", query = "SELECT m FROM Member1 m WHERE m.occupation = :occupation"), @NamedQuery(name = "Member1.findByExpertise", query = "SELECT m FROM Member1 m WHERE m.expertise = :expertise"), @NamedQuery(name = "Member1.findByInstitution", query = "SELECT m FROM Member1 m WHERE m.institution = :institution"), @NamedQuery(name = "Member1.findByTipo", query = "SELECT m FROM Member1 m WHERE m.tipo = :tipo"), @NamedQuery(name = "Member1.findByDatainsc", query = "SELECT m FROM Member1 m WHERE m.datainsc = :datainsc"), @NamedQuery(name = "Member1.findByPagou", query = "SELECT m FROM Member1 m WHERE m.pagou = :pagou"), @NamedQuery(name = "Member1.findByDatapagto", query = "SELECT m FROM Member1 m WHERE m.datapagto = :datapagto"), @NamedQuery(name = "Member1.findByCourse", query = "SELECT m FROM Member1 m WHERE m.course = :course"), @NamedQuery(name = "Member1.findByValorinsc", query = "SELECT m FROM Member1 m WHERE m.valorinsc = :valorinsc"), @NamedQuery(name = "Member1.findByAb3cmember", query = "SELECT m FROM Member1 m WHERE m.ab3cmember = :ab3cmember"), @NamedQuery(name = "Member1.findByCategoryType", query = "SELECT m FROM Member1 m WHERE m.categoryType = :categoryType"), @NamedQuery(name = "Member1.findByUserKey", query = "SELECT m FROM Member1 m WHERE m.userKey = :userKey")})
public class Member1 implements Serializable, Comparable<Member1> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false) 
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Column(name = "name")
    private String name;
    @Column(name = "namecracha")
    private String namecracha;
    @Column(name = "rg")
    private String rg;
    @Column(name = "pass")
    private String pass;
    @Column(name = "address")
    private String address;
    @Column(name = "neighborhood")
    private String neighborhood;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "zipcode")
    private String zipcode;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "cell")
    private String cell;
    @Column(name = "fax")
    private String fax;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "expertise")
    private String expertise;
    @Column(name = "institution")
    private String institution;
    @Column(name = "tipo")
    private Integer tipo;
    @Column(name = "datainsc")
    private String datainsc;
    @Column(name = "pagou")
    private Integer pagou;
    @Column(name = "datapagto")
    private String datapagto;
    @Column(name = "course")
    private Integer course;
    @Column(name = "valorinsc")
    private String valorinsc;
    @Column(name = "ab3cmember")
    private String ab3cmember;
    @Column(name = "category_type")
    private Integer categoryType;
    @Column(name = "userKey")
    private String userKey;

    public Member1() {
    }

    public Member1(Integer id) {
        this.id = id;
    }

    public Member1(Integer id, String cpf, String login, String email) {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        if (!(object instanceof Member1)) {
            return false;
        }
        Member1 other = (Member1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.usp.fmrp.entidades.Member1[id=" + id + "]";
    }

    public int compareTo(Member1 o) {
        return this.name.compareTo(o.getName());
    }

}
