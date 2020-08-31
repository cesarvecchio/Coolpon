package br.com.coolpon.coolpon.voucher;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.ShoppingCart;

import java.time.LocalDateTime;

public class VoucherMoney extends VoucherBase{

    private Double valueDiscont;
    public VoucherMoney(Integer id, String businessId, Integer userId, String name, String description, LocalDateTime createdAt, LocalDateTime claimedAt, Boolean status, LocalDateTime expirationDate) {
        super(id, businessId, userId, name, description, createdAt, claimedAt, status, expirationDate);
        this.valueDiscont = valueDiscont;
    }


    @Override
    public void useVoucher(ShoppingCart shoppingCart) {
        if (super.getStatus()) {
            shoppingCart.setTotalPrice(shoppingCart.calulateTotalPrice() * this.getValueDiscont());
            shoppingCart.getVoucherList().add(this);
            this.setStatus(false);
        }else {
            System.out.println("Esse voucher não está valido");
        }
    }

    public Double getValueDiscont() {
        return valueDiscont;
    }

    public void setValueDiscont(Double valueDiscont) {
        this.valueDiscont = valueDiscont;
    }
}
