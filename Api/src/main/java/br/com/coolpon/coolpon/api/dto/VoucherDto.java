package br.com.coolpon.coolpon.api.dto;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.api.model.Voucher;
import br.com.coolpon.coolpon.voucher.VoucherMoney;
import br.com.coolpon.coolpon.voucher.VoucherProduct;

import javax.persistence.Column;
import javax.persistence.Id;

public class VoucherDto {

    private Integer id;
    private String cod;
    private boolean active;
    private String type;
    private String createdAt;
    private Integer fkBusiness;
    private Double valueDiscont;
    private String codProduct;

    public VoucherDto(Integer id, String cod, boolean active, String type, String createdAt, Integer fkBusiness, Double valueDiscont, String codProduct) {
        this.id = id;
        this.cod = cod;
        this.active = active;
        this.type = type;
        this.createdAt = createdAt;
        this.fkBusiness = fkBusiness;
        this.valueDiscont = valueDiscont;
        this.codProduct = codProduct;
    }

    public VoucherDto(Voucher entity){
        this.id = entity.getId();
        this.createdAt = entity.getCreatedAt();
        this.fkBusiness = entity.getBusinessId();
        this.type = entity.getType();
        this.codProduct = entity.getCodProduct();
        this.valueDiscont = entity.getValueDiscont();
        this.cod = entity.getCod();
        this.active = entity.isActive();
    }

    public VoucherDto(VoucherMoney money){
        this.id = money.getId();
        this.cod = money.getCod();
        this.createdAt = money.getCreatedAt();
        this.fkBusiness = money.getFkBusiness();
        this.type = "money";
        this.codProduct = null;
        this.valueDiscont = money.getValueDiscont();
        this.active = money.getActive();
    }

    public VoucherDto(VoucherProduct product){
        this.id = product.getId();
        this.createdAt = product.getCreatedAt();
        this.fkBusiness = product.getFkBusiness();
        this.type = "product";
        this.codProduct = product.getProduct().getCod();
        this.valueDiscont = null;
        this.active = product.getActive();
    }

    public Voucher toEntity(){
        Voucher entity = new Voucher();
        entity.setBusinessId(this.fkBusiness);
        entity.setCreatedAt(this.createdAt);
        entity.setId(this.id);
        entity.setType(this.type);
        entity.setValueDiscont(this.valueDiscont);
        entity.setCodProduct(this.codProduct);
        entity.setCod(this.cod);
        entity.setActive(this.active);
        return entity;
    }
    public VoucherMoney toMoney(){
        VoucherMoney money = new VoucherMoney();
        money.setFkBusiness(this.fkBusiness);
        money.setCreatedAt(this.createdAt);
        money.setId(this.id);
        money.setCod(this.cod);
        money.setValueDiscont(this.valueDiscont);
        money.setActive(this.active);
        return money;
    }

    public VoucherProduct toProduct(){
        VoucherProduct product = new VoucherProduct();
        product.setFkBusiness(this.fkBusiness);
        product.setCreatedAt(this.createdAt);
        product.setId(this.id);
        product.setCod(this.cod);
        product.setProduct(new Product(this.codProduct));
        product.setActive(this.active);
        return product;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getFkBusiness() {
        return fkBusiness;
    }

    public void setFkBusiness(Integer fkBusiness) {
        this.fkBusiness = fkBusiness;
    }

    public Double getValueDiscont() {
        return valueDiscont;
    }

    public void setValueDiscont(Double valueDiscont) {
        this.valueDiscont = valueDiscont;
    }

    public String getCodProduct() {
        return codProduct;
    }

    public void setCodProduct(String codProduct) {
        this.codProduct = codProduct;
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
