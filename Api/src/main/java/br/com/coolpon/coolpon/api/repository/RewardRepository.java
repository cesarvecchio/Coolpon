package br.com.coolpon.coolpon.api.repository;

import br.com.coolpon.coolpon.api.model.Reward;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RewardRepository extends CrudRepository<Reward,Integer> {
}
