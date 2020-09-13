package br.com.coolpon.coolpon.api.service;

import br.com.coolpon.coolpon.ShoppingCart;
import br.com.coolpon.coolpon.api.controller.ProductController;
import br.com.coolpon.coolpon.api.dto.UserDto;
import br.com.coolpon.coolpon.api.dto.VoucherDto;
import br.com.coolpon.coolpon.api.model.Voucher;
import br.com.coolpon.coolpon.api.repository.UserRepository;
import br.com.coolpon.coolpon.api.repository.VoucherRepository;
import br.com.coolpon.coolpon.voucher.VoucherBase;
import br.com.coolpon.coolpon.voucher.VoucherMoney;
import br.com.coolpon.coolpon.voucher.VoucherProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VoucherService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProductController productController;
    @Autowired
    VoucherRepository voucherRepository;

    public String useVoucher(Integer idUser, Integer idVoucher) {
        List<ShoppingCart> shoppingCarts = productController.getShoppingCarts();
        Optional<Voucher> voucherOptional = voucherRepository.findById(idVoucher);
        VoucherBase voucher;
        if (voucherOptional.isPresent()) {
            VoucherDto voucherDto = new VoucherDto(voucherOptional.get());

            if (voucherDto.getType().equals("money")) {
                voucher = voucherDto.toMoney();
            } else {
                voucher = voucherDto.toProduct();
            }
            for (ShoppingCart shoppingCart : shoppingCarts) {
                if (shoppingCart.getUser().getId().equals(idUser)) {
                    shoppingCart.getVoucherList().add(voucher);
                    return voucher.useVoucher(shoppingCart);
                }
            }
            return "Não há nenhum carrinho de compras cadastrado";
        }
        return "IdVoucher inexistente";
    }

    public List<VoucherDto> getAllVoucher(){
        List<VoucherDto> voucherDtos = new ArrayList<>();
        voucherRepository.findAll().forEach(voucher -> voucherDtos.add(new VoucherDto(voucher)));
        return voucherDtos;
    }

    public void addVoucherMoney(Integer idBusiness,VoucherMoney voucherMoney){
        VoucherDto voucher = new VoucherDto(voucherMoney);
        voucher.setFkBusiness(idBusiness);
        voucherRepository.save(voucher.toEntity());
    }
    public void addVoucherProduct(Integer idBusiness, VoucherProduct voucherProduct){
        VoucherDto voucher = new VoucherDto(voucherProduct);
        voucher.setFkBusiness(idBusiness);
        voucherRepository.save(voucher.toEntity());
    }
}
