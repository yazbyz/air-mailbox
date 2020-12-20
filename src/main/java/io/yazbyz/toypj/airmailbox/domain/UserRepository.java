package io.yazbyz.toypj.airmailbox.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findByNameLike(String name);

}
