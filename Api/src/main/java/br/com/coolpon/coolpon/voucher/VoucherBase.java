package br.com.coolpon.coolpon.voucher;

import br.com.coolpon.coolpon.ShoppingCart;
import br.com.coolpon.coolpon.api.model.User;

import java.time.LocalDateTime;

public abstract class VoucherBase {
    private Integer id;
    private String cod;
    private Integer fkBusiness;
    private Integer userId;
    private String name;
    private String description;
    private String createdAt;
    private String claimedAt;
    private Boolean active;
    private String expirationDate;

    public VoucherBase(Integer id, String cod, Integer fkBusiness, Integer userId, String name, String description, String createdAt, String claimedAt, Boolean active, String expirationDate) {
        this.id = id;
        this.cod = cod;
        this.fkBusiness = fkBusiness;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.claimedAt = claimedAt;
        this.active = active;
        this.expirationDate = expirationDate;
    }

    public void claimedVoucher(User user) {
        this.setUserId(user.getId());
        this.setClaimedAt(LocalDateTime.now().toString());
    }

    public VoucherBase() {
    }

    public abstract String useVoucher(ShoppingCart shoppingCart);

    public void expirationVoucher(String expirationDate){
        this.expirationDate = expirationDate;
    };

    @Override
    public String toString() {
        return "VoucherBase{" +
                "id=" + id +
                ", cod='" + cod + '\'' +
                ", fkBusiness=" + fkBusiness +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", claimedAt='" + claimedAt + '\'' +
                ", active=" + active +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getClaimedAt() {
        return claimedAt;
    }

    public void setClaimedAt(String claimedAt) {
        this.claimedAt = claimedAt;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkBusiness() {
        return fkBusiness;
    }

    public void setFkBusiness(Integer fkBusiness) {
        this.fkBusiness = fkBusiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
}