package br.com.coolpon.coolpon;

import br.com.coolpon.coolpon.api.service.PromotionService;
import br.com.coolpon.coolpon.promotion.Promotion;

public class Teste {
    public static void main(String[] args) {
        PromotionService promotionService = new PromotionService();
        System.out.println(promotionService.getAllPromotions());
    }
}
