/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.entidades;

import java.io.Serializable;

/**
 *
 * @author marcelo
 */
public class Participante  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String cpf;
    private String login;
    private String email;
    private String name;
    private String namecracha;
    private String rg;
    private String pass;
    private String address;
    private String neighborhood;
    private String city;
    private String state;
    private String nationality;
    private String zipcode;
    private String telephone;
    private String cell;
    private String fax;
    private String occupation;
    private String expertise;
    private String institution;
    private Integer tipo;
    private String datainsc;
    private Integer pagou;
    private String datapagto;
    private Integer course;
    private String valorinsc;
    private String ab3cmember;
    private Integer categoryType;
    private String userKey;




    public String getAb3cmember() {
        return ab3cmember;
    }

    public void setAb3cmember(String ab3cmember) {
        this.ab3cmember = ab3cmember;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatainsc() {
        return datainsc;
    }

    public void setDatainsc(String datainsc) {
        this.datainsc = datainsc;
    }

    public String getDatapagto() {
        return datapagto;
    }

    public void setDatapagto(String datapagto) {
        this.datapagto = datapagto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Integer getPagou() {
        return pagou;
    }

    public void setPagou(Integer pagou) {
        this.pagou = pagou;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getValorinsc() {
        return valorinsc;
    }

    public void setValorinsc(String valorinsc) {
        this.valorinsc = valorinsc;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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

}
