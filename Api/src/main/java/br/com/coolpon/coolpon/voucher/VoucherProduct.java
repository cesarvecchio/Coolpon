package br.com.coolpon.coolpon.voucher;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.ShoppingCart;

import java.time.LocalDateTime;

public class VoucherProduct extends VoucherBase {
    private Product product;
    private Double priceCondition;

    public VoucherProduct(Integer id, String businessId, Integer userId, String name, String description, LocalDateTime createdAt, LocalDateTime claimedAt, Boolean status, LocalDateTime expirationDate, Product product, Double priceCondition) {
        super(id, businessId, userId, name, description, createdAt, claimedAt, status, expirationDate);
        this.product = product;
        this.priceCondition = priceCondition;
    }


    @Override
    public boolean useVoucher(ShoppingCart shoppingCart) {
        if(this.getStatus()) {
            shoppingCart.getProductList().add(this.product);
            shoppingCart.getVoucherList().add(this);
            this.setStatus(false);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "VoucherProduct{" +
                "product=" + product +
                ", priceCondition=" + priceCondition +
                "} " + super.toString();
    }

    public Product getProductList() {
        return product;
    }

    public void setProductList(Product product) {
        this.product = product;
    }

    public Double getPriceCondition() {
        return priceCondition;
    }

    public void setPriceCondition(Double priceCondition) {
        this.priceCondition = priceCondition;
    }
}
