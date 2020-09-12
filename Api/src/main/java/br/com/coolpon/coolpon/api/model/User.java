package br.com.coolpon.coolpon.api.model;

import javax.persistence.*;

@Entity
@Table(name="`user`")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String phone;
    @Column
    private String cpf;
    @Column
    private String fullName;
    @Column
    private String birthDate;
    @Column
    private Integer fkLoyalty;
    @Column
    private Integer fkBusiness;
    public User() {
    }

    public Integer getFkLoyalty() {
        return fkLoyalty;
    }

    public void setFkLoyalty(Integer fkLoyalty) {
        this.fkLoyalty = fkLoyalty;
    }

    public Integer getFkBusiness() {
        return fkBusiness;
    }

    public void setFkBusiness(Integer fkBusiness) {
        this.fkBusiness = fkBusiness;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
