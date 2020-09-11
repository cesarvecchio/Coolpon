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
    private String descricao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
                ", descricao='" + descricao + '\'' +
                ", fkBusiness=" + fkBusiness +
                '}';
    }
}
