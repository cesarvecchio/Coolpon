package br.com.coolpon.coolpon.api.repository;

import br.com.coolpon.coolpon.api.model.Voucher;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface VoucherRepository extends CrudRepository<Voucher,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE Voucher set active = :active where id = :id")
    public void updateStatus(Integer id,boolean active);
}
