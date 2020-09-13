package br.com.coolpon.coolpon.api.dto;

import br.com.coolpon.coolpon.api.model.Reward;

public class RewardDto {

    private Integer id;
    private Integer fkVoucher;
    private Integer userId;
    private String claimedAt;

    public RewardDto(Integer id, Integer fkVoucher, Integer userId, String expirationDate, String claimedAt) {
        this.id = id;
        this.fkVoucher = fkVoucher;
        this.userId = userId;
        this.claimedAt = claimedAt;
    }

    public RewardDto() {
    }

    public RewardDto(Reward entity) {
        this.id = entity.getId();
        this.fkVoucher = entity.getFkVoucher();
        this.userId = entity.getFkUser();
        this.claimedAt = entity.getClaimedAt();
    }

    public Reward toEntity(){
        Reward entity = new Reward();
        entity.setId(this.id);
        entity.setClaimedAt(this.claimedAt);
        entity.setFkVoucher(this.fkVoucher);
        entity.setFkUser(this.userId);
        return entity;
    }


}

