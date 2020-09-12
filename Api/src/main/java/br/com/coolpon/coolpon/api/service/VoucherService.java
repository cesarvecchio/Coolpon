package br.com.coolpon.coolpon.api.service;

import br.com.coolpon.coolpon.api.dto.UserDto;
import br.com.coolpon.coolpon.api.dto.VoucherDto;
import br.com.coolpon.coolpon.api.model.Voucher;
import br.com.coolpon.coolpon.api.repository.UserRepository;
import br.com.coolpon.coolpon.api.repository.VoucherRepository;
import br.com.coolpon.coolpon.voucher.VoucherBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VoucherService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    VoucherRepository voucherRepository;

    public boolean useVoucher(Integer idUser, VoucherBase voucherBase) {
        return voucherBase.useVoucher(new UserDto(userRepository.findById(idUser).get()).getShoppingCart());
    }

    public List<VoucherDto> getAllVoucher(){
        List<VoucherDto> voucherDtos = new ArrayList<>();
        voucherRepository.findAll().forEach(voucher -> voucherDtos.add(new VoucherDto(voucher)));
        return voucherDtos;
    }
}
