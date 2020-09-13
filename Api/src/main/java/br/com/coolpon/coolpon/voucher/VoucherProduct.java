package br.com.coolpon.coolpon.voucher;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.ShoppingCart;

import java.time.LocalDateTime;

public class VoucherProduct extends VoucherBase {
    private Product product;

    public VoucherProduct(Integer id, String cod, Integer fkBusiness, Integer userId, String name, String description, String createdAt, String claimedAt, Boolean status, String expirationDate, Product product) {
        super(id, cod, fkBusiness, userId, name, description, createdAt, claimedAt, status, expirationDate);
        this.product = product;
    }

    public VoucherProduct() {
    }

    @Override
    public String useVoucher(ShoppingCart shoppingCart) {
        if(this.getActive()) {
            shoppingCart.getProductList().add(this.product);
            shoppingCart.getVoucherList().add(this);
            return "ok";
        }else {
            return "Cupon não está válido";
        }
    }

    @Override
    public String toString() {
        return "VoucherProduct{" +
                "product=" + product +
                "} " + super.toString();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
