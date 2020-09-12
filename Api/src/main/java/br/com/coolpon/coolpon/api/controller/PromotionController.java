package br.com.coolpon.coolpon.api.controller;

import br.com.coolpon.coolpon.api.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/promotions")
public class PromotionController {

    @Autowired
    PromotionService promotionService;
@GetMapping
    public ResponseEntity getAllPromotions(){
    return ResponseEntity.ok(promotionService.getAllPromotions());
}

}
