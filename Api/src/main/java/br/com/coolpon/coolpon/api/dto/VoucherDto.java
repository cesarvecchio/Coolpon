package br.com.coolpon.coolpon.api.dto;

import br.com.coolpon.coolpon.api.model.Voucher;

import javax.persistence.Column;
import javax.persistence.Id;

public class VoucherDto {

    private Integer id;
    private String type;
    private String name;
    private String description;
    private String createdAt;
    private String businessId;

    public VoucherDto(Integer id, String type, String name, String description, String createdAt, String businessId) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.businessId = businessId;
    }

    public VoucherDto(Voucher entity){
        this.id = entity.getId();
        this.createdAt = entity.getCreatedAt();
        this.description = entity.getDescription();
        this.businessId = entity.getBusinessId();
        this.name = entity.getName();
        this.type = entity.getType();
    }

    public Voucher toEntity(){
        Voucher entity = new Voucher();
        entity.setBusinessId(this.businessId);
        entity.setCreatedAt(this.createdAt);
        entity.setDescription(this.description);
        entity.setId(this.id);
        entity.setName(this.name);
        entity.setType(this.type);
        return entity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }
}
