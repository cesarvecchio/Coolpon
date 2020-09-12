package br.com.coolpon.coolpon.api.model;

import br.com.coolpon.coolpon.promotion.Promotion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
public class Business {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private String cpf;
    @Column
    private String cnpj;
    @Column
    private String phone;
    @Column
    private String email;
    @Column
    private String password;

    public Business(Integer id, String name, String cpf, String cnpj, String phone, String email, String password) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }

    public Business() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Business{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
