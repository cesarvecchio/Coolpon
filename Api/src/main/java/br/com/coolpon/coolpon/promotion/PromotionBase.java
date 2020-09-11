package br.com.coolpon.coolpon.promotion;

import br.com.coolpon.coolpon.api.model.Business;

public abstract class PromotionBase {
    private Integer id;
    private Integer numberOfTimes;
    private boolean active;
    private Business business;

    public PromotionBase(Integer id, Integer numberOfTimes, boolean active, Business business) {
        this.id = id;
        this.numberOfTimes = numberOfTimes;
        this.active = active;
        this.business = business;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumberOfTimes() {
        return numberOfTimes;
    }

    public void setNumberOfTimes(Integer numberOfTimes) {
        this.numberOfTimes = numberOfTimes;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }

    @Override
    public String toString() {
        return "PromotionBase{" +
                "id=" + id +
                ", numberOfTimes=" + numberOfTimes +
                ", active=" + active +
                ", business=" + business +
                '}';
    }
}
