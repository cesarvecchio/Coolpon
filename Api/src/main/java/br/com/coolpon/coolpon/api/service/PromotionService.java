package br.com.coolpon.coolpon.api.service;

import br.com.coolpon.coolpon.api.model.Promotion;
import br.com.coolpon.coolpon.api.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class PromotionService {

    @Autowired
    PromotionRepository promotionRepository;

    public Promotion getAllPromotions(){
        return promotionRepository.findById(1).get();
    }

}
