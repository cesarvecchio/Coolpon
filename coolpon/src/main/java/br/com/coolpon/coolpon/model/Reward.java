package br.com.coolpon.coolpon.model;

public class Reward {

    private Integer id;
    private String voucherId;
    private Integer userId;
    private String expirationDate;
    private String status;
    private String claimedAt;

    public Reward(Integer id, String voucherId, Integer userId, String expirationDate, String status, String claimedAt) {
        this.id = id;
        this.voucherId = voucherId;
        this.userId = userId;
        this.expirationDate = expirationDate;
        this.status = status;
        this.claimedAt = claimedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClaimedAt() {
        return claimedAt;
    }

    public void setClaimedAt(String claimedAt) {
        this.claimedAt = claimedAt;
    }
}
