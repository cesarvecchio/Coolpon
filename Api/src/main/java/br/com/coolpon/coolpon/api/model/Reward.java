package br.com.coolpon.coolpon.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reward {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private Integer fkVoucher;
    @Column
    private Integer fkUser;
    @Column
    private String claimedAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFkVoucher() {
        return fkVoucher;
    }

    public void setFkVoucher(Integer fkVoucher) {
        this.fkVoucher = fkVoucher;
    }

    public Integer getFkUser() {
        return fkUser;
    }

    public void setFkUser(Integer fkUser) {
        this.fkUser = fkUser;
    }

    public String getClaimedAt() {
        return claimedAt;
    }

    public void setClaimedAt(String claimedAt) {
        this.claimedAt = claimedAt;
    }
}
