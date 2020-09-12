package br.com.coolpon.coolpon.api.repository;

import br.com.coolpon.coolpon.api.model.Voucher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherRepository extends CrudRepository<Voucher,Integer> {
}
