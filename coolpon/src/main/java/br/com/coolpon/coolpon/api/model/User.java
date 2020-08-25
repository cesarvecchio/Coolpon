package br.com.coolpon.coolpon.api.model;

public class User {
    private Integer id;
    private String phone;
    private String fullName;
    private String birthDate;

    public User() {
    }

    public User(Integer id, String phone, String fullName, String birthDate) {
        this.id = id;
        this.phone = phone;
        this.fullName = fullName;
        this.birthDate = birthDate;
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
