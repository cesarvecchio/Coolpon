package br.com.coolpon.coolpon.api.dto;

import br.com.coolpon.coolpon.ShoppingCart;
import br.com.coolpon.coolpon.api.model.User;

public class UserDto {

    private Integer id;
    private String phone;
    private String cpf;
    private String fullName;
    private String birthDate;
    private Integer fkLoyalty;
    private Integer fkBussines;

    public UserDto() {
    }

    public UserDto(User user) {
        this.id = user.getId();
        this.phone = user.getPhone();
        this.fullName = user.getFullName();
        this.birthDate = user.getBirthDate();
        this.cpf = user.getCpf();
        this.fkBussines = user.getFkBusiness();
        this.fkLoyalty = user.getFkLoyalty();
    }

    public User toEntity() {
        User entity = new User();
        entity.setId(this.id);
        entity.setPhone(this.phone);
        entity.setFullName(this.fullName);
        entity.setBirthDate(this.birthDate);
        entity.setCpf(this.cpf);
        entity.setFkBusiness(this.fkBussines);
        entity.setFkLoyalty(this.fkLoyalty);
        return entity;
    }

    public Integer getFkLoyalty() {
        return fkLoyalty;
    }

    public void setFkLoyalty(Integer fkLoyalty) {
        this.fkLoyalty = fkLoyalty;
    }

    public Integer getFkBussines() {
        return fkBussines;
    }

    public void setFkBussines(Integer fkBussines) {
        this.fkBussines = fkBussines;
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
