package br.com.coolpon.coolpon.api.model;

import br.com.coolpon.coolpon.promotion.PromotionBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Promotion {
    @Id
    private Integer id;
    @Column
    private Integer numberOfTimes;
    @Column
    private boolean active;
    @Column
    private String description;
    @Column
    private Integer fkBusiness;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getFkBusiness() {
        return fkBusiness;
    }

    public void setFkBusiness(Integer fkBusiness) {
        this.fkBusiness = fkBusiness;
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "id=" + id +
                ", numberOfTimes=" + numberOfTimes +
                ", active=" + active +
                ", description='" + description + '\'' +
                ", fkBusiness=" + fkBusiness +
                '}';
    }
}
