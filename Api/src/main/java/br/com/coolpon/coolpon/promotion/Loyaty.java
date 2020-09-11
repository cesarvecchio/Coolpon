package br.com.coolpon.coolpon.promotion;

import br.com.coolpon.coolpon.api.model.Business;

public class Loyaty extends PromotionBase {
    private Promotion promotion;

    public Loyaty(Integer id, Integer numberOfTimes, boolean active, Business business) {
        super(id, numberOfTimes, active, business);
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    @Override
    public String toString() {
        return "Loyaty{" +
                "promotion=" + promotion +
                "} " + super.toString();
    }
}
