package br.com.coolpon.coolpon.api.controller;

import br.com.coolpon.coolpon.api.dto.RewardDto;
import br.com.coolpon.coolpon.api.dto.VoucherDto;
import br.com.coolpon.coolpon.api.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rewards")
public class RewardController {
    @Autowired
    RewardService rewardService;

    @GetMapping()
    public ResponseEntity allReward(){
        List<RewardDto> rewardDtos = rewardService.getAllReward();
        if (rewardDtos.isEmpty()){
            return ResponseEntity.status(204).build();
        }else {
            return ResponseEntity.ok(rewardDtos);
        }
    }
}
