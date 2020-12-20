package io.yazbyz.toypj.airmailbox.service;

import java.util.Optional;

import io.yazbyz.toypj.airmailbox.domain.User;

public interface UserService {

	Optional<User> findById(Long id);
}
