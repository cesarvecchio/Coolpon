package br.com.coolpon.coolpon.api.dto;

import br.com.coolpon.coolpon.api.model.Reward;

public class RewardDto {

    private Integer id;
    private String voucherId;
    private Integer userId;
    private String expirationDate;
    private String claimedAt;

    public RewardDto(Integer id, String voucherId, Integer userId, String expirationDate, String claimedAt) {
        this.id = id;
        this.voucherId = voucherId;
        this.userId = userId;
        this.expirationDate = expirationDate;
        this.claimedAt = claimedAt;
    }

    public RewardDto() {
    }

    public RewardDto(Reward entity) {
        this.id = entity.getId();
        this.voucherId = entity.getVoucherId();
        this.userId = entity.getUserId();
        this.expirationDate = entity.getExpirationDate();
        this.claimedAt = entity.getClaimedAt();
    }

    public Reward toEntity(){
        Reward entity = new Reward();
        entity.setVoucherId(this.voucherId);
        entity.setClaimedAt(this.claimedAt);
        entity.setVoucherId(this.voucherId);
        entity.setExpirationDate(this.expirationDate);
        entity.setUserId(this.userId);
        return entity;
    }


}

