package br.com.coolpon.coolpon;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.api.dto.UserDto;
import br.com.coolpon.coolpon.voucher.VoucherBase;
import br.com.coolpon.coolpon.api.model.User;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private UserDto user;
    private List<Product> productList;
    private List<VoucherBase> voucherList;
    private Double totalPrice;

    public ShoppingCart() {
        this.productList = new ArrayList<>();
        this.voucherList = new ArrayList<>();
        this.totalPrice = 0.0;
        this.user = null;
    }

    public Double calulateTotalPrice(){
        Double total = 0.0;
        for (Product product:productList){
            total += product.getPrice();
        }
        setTotalPrice(totalPrice);
        return total;
    }

    public void setTotalPrice(Double totalPrice){
        this.totalPrice = totalPrice;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<VoucherBase> getVoucherList() {
        return voucherList;
    }

    public void setVoucherList(List<VoucherBase> voucherList) {
        this.voucherList = voucherList;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }
}
