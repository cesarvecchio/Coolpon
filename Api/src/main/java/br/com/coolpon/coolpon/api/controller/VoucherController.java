package br.com.coolpon.coolpon.api.controller;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.ShoppingCart;
import br.com.coolpon.coolpon.api.dto.UserDto;
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

    @PostMapping("/money/{idBusiness}")
    public ResponseEntity addVoucherMoney(@PathVariable Integer idBusiness,@RequestBody VoucherMoney voucherMoney){
        voucherService.addVoucherMoney(idBusiness,voucherMoney);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/product/{idBusiness}")
    public ResponseEntity addVoucherProduct(@PathVariable Integer idBusiness,@RequestBody VoucherProduct voucherProduct){
        voucherService.addVoucherProduct(idBusiness,voucherProduct);
        return ResponseEntity.status(201).build();
    }


    @PostMapping("/use/{idVoucher}/{idUser}")
    public ResponseEntity useVoucher(@PathVariable Integer idUser,@PathVariable Integer idVoucher){
        String mensagem = voucherService.useVoucher(idUser,idVoucher);
        if (mensagem.equals("ok")){
            return ResponseEntity.status(201).build();
        }else {
            return ResponseEntity.ok(mensagem);
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







}
