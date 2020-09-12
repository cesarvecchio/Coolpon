package br.com.coolpon.coolpon.api.controller;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.ShoppingCart;
import br.com.coolpon.coolpon.api.dto.VoucherDto;
import br.com.coolpon.coolpon.api.model.User;
import br.com.coolpon.coolpon.api.service.UserService;
import br.com.coolpon.coolpon.api.service.VoucherService;
import br.com.coolpon.coolpon.voucher.VoucherBase;
import br.com.coolpon.coolpon.voucher.VoucherMoney;
import br.com.coolpon.coolpon.voucher.VoucherProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/vouchers")
public class VoucherController {
    @Autowired
    VoucherService voucherService;

    @PostMapping("/voucherMoney/{idUser}")
    public ResponseEntity addVoucherMoney(@PathVariable Integer idUser,@RequestBody VoucherMoney voucherMoney){
        boolean isSucess = voucherService.useVoucher(idUser,voucherMoney);
        if (isSucess){
            return ResponseEntity.status(201).build();
        }else {
            return ResponseEntity.ok("Código invalido");
        }
    }

    @PostMapping("/voucherProduct/{idUser}")
    public ResponseEntity addVoucherProduct(@PathVariable Integer idUser,@RequestBody VoucherProduct voucherProduct){
        boolean isSucess = voucherService.useVoucher(idUser,voucherProduct);
        if (isSucess){
            return ResponseEntity.status(201).build();
        }else {
            return ResponseEntity.ok("Código invalido");
        }
    }

    @GetMapping()
    public ResponseEntity allVoucher(){
        List<VoucherDto> voucherDtos = voucherService.getAllVoucher();
        if (voucherDtos.isEmpty()){
            return ResponseEntity.status(204).build();
        }else {
            return ResponseEntity.ok(voucherDtos);
        }
    }

//    @PostMapping("/addProduct")
//    public String addProduct(@RequestBody Product product){
//        shoppingCart.getProductList().add(product);
//        return String.format("Voucher usado com sucesso: " + shoppingCart.getProductList());
//    }
//
//    @GetMapping("/listProduct")
//    public List<Product> allProduct(){
//        return shoppingCart.getProductList();
//    }


}
