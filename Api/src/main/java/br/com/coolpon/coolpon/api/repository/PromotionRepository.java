package br.com.coolpon.coolpon.api.repository;

import br.com.coolpon.coolpon.api.model.Promotion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PromotionRepository extends CrudRepository<Promotion, Integer>  {
}
