package br.com.coolpon.coolpon.api.model;

public class LoginForm {
    private String fullName;
    private String phone;


    public LoginForm() {
    }

    public LoginForm(String fullName, String phone) {
        this.fullName = fullName;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
