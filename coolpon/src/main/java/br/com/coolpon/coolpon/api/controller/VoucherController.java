package br.com.coolpon.coolpon.api.controller;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.ShoppingCart;
import br.com.coolpon.coolpon.api.model.User;
import br.com.coolpon.coolpon.api.service.UserService;
import br.com.coolpon.coolpon.voucher.VoucherBase;
import br.com.coolpon.coolpon.voucher.VoucherMoney;
import br.com.coolpon.coolpon.voucher.VoucherProduct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/voucher")
public class VoucherController {
    private ShoppingCart shoppingCart = new ShoppingCart();

    @PostMapping("/addVoucherMoney")
    public String addVoucherMoney(@RequestBody VoucherMoney voucherMoney){
    voucherMoney.useVoucher(shoppingCart);
    return String.format("Voucher usado com sucesso: " + shoppingCart.getVoucherList());
    }

    @PostMapping("/addVoucherProduct")
    public String addVoucherProduct(@RequestBody VoucherProduct voucherProduct){
    voucherProduct.useVoucher(shoppingCart);
    return String.format("Voucher usado com sucesso: " + shoppingCart.getVoucherList());
    }

    @GetMapping("/listVoucher")
    public List<VoucherBase> allVoucher(){
        return shoppingCart.getVoucherList();
    }

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product){
        shoppingCart.getProductList().add(product);
        return String.format("Voucher usado com sucesso: " + shoppingCart.getProductList());
    }

    @GetMapping("/listProduct")
    public List<Product> allProduct(){
        return shoppingCart.getProductList();
    }


}
