package br.com.coolpon.coolpon.voucher;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.ShoppingCart;

import java.time.LocalDateTime;

public class VoucherMoney extends VoucherBase{

    private Double valueDiscont;

    public VoucherMoney(Integer id, String cod, Integer fkBusiness, Integer userId, String name, String description, String createdAt, String claimedAt, Boolean status, String expirationDate, Double valueDiscont) {
        super(id, cod, fkBusiness, userId, name, description, createdAt, claimedAt, status, expirationDate);
        this.valueDiscont = valueDiscont;
    }

    public VoucherMoney() {
    }

    @Override
    public String useVoucher(ShoppingCart shoppingCart) {
        if (super.getActive()) {
            shoppingCart.setTotalPrice(shoppingCart.calulateTotalPrice() * this.getValueDiscont());
            shoppingCart.getVoucherList().add(this);
            this.setActive(false);
            return "ok";
        }else {
            return "Cupon não está válido";
        }
    }

    public Double getValueDiscont() {
        return valueDiscont;
    }

    public void setValueDiscont(Double valueDiscont) {
        this.valueDiscont = valueDiscont;
    }
}
