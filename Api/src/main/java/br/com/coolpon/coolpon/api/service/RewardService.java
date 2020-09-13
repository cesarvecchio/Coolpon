package br.com.coolpon.coolpon.api.service;

import br.com.coolpon.coolpon.api.dto.RewardDto;
import br.com.coolpon.coolpon.api.dto.VoucherDto;
import br.com.coolpon.coolpon.api.repository.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Service
public class RewardService {
    @Autowired
    RewardRepository rewardRepository;

    public List<RewardDto> getAllReward(){
        List<RewardDto> rewardDtos = new ArrayList<>();
        rewardRepository.findAll().forEach(reward -> rewardDtos.add(new RewardDto(reward)));
        return rewardDtos;
    }
}
