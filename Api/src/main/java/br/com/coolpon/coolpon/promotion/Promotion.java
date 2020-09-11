package br.com.coolpon.coolpon.promotion;

import br.com.coolpon.coolpon.api.model.Business;

public class Promotion extends PromotionBase {

    private String descricao;

    public Promotion(Integer id, Integer numberOfTimes, boolean active, Business business, String descricao) {
        super(id, numberOfTimes, active, business);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "descricao='" + descricao + '\'' +
                "} " + super.toString();
    }
}
