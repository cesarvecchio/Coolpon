package br.com.coolpon.coolpon.voucher;

import br.com.coolpon.coolpon.ShoppingCart;
import br.com.coolpon.coolpon.api.model.User;

import java.time.LocalDateTime;

public abstract class VoucherBase {
    private Integer id;
    private String businessId;
    private Integer userId;
    private String name;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime claimedAt;
    private Boolean status;
    private LocalDateTime expirationDate;

    public VoucherBase(Integer id, String businessId, Integer userId, String name, String description, LocalDateTime createdAt, LocalDateTime claimedAt, Boolean status, LocalDateTime expirationDate) {
        this.id = id;
        this.businessId = businessId;
        this.userId = userId;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.claimedAt = claimedAt;
        this.status = status;
        this.expirationDate = expirationDate;
    }

    public void claimedVoucher(User user) {
        this.setUserId(user.getId());
        this.setClaimedAt(LocalDateTime.now());
    }

    public abstract boolean useVoucher(ShoppingCart shoppingCart);

    public void expirationVoucher(LocalDateTime expirationDate){
        this.expirationDate = expirationDate;
    };

    @Override
    public String toString() {
        return "VoucherBase{" +
                "id=" + id +
                ", businessId='" + businessId + '\'' +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", claimedAt='" + claimedAt + '\'' +
                ", status='" + status + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getClaimedAt() {
        return claimedAt;
    }

    public void setClaimedAt(LocalDateTime claimedAt) {
        this.claimedAt = claimedAt;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
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

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
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


    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

}