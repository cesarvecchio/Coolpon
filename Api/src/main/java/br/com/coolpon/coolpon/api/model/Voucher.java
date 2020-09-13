package br.com.coolpon.coolpon.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Voucher {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String cod;
    @Column
    private boolean active;
    @Column
    private String type;
    @Column
    private String createdAt;
    @Column
    private String codProduct;
    @Column
    private Double valueDiscont;
    @Column
    private Integer fkBusiness;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessId() {
        return fkBusiness;
    }

    public void setBusinessId(Integer fkBusiness) {
        this.fkBusiness = fkBusiness;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(String codProduct) {
        this.codProduct = codProduct;
    }

    public Double getValueDiscont() {
        return valueDiscont;
    }

    public void setValueDiscont(Double valueDiscont) {
        this.valueDiscont = valueDiscont;
    }

    public Integer getFkBusiness() {
        return fkBusiness;
    }

    public void setFkBusiness(Integer fkBusiness) {
        this.fkBusiness = fkBusiness;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
