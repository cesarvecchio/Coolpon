package br.com.coolpon.coolpon.api.repository;

import br.com.coolpon.coolpon.api.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    public List<User> findByPhone(String phone);
    public List<User> findByCpf(String cpf);
}
