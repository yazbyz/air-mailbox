package io.yazbyz.toypj.airmailbox.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.yazbyz.toypj.airmailbox.domain.User;
import io.yazbyz.toypj.airmailbox.domain.UserRepository;

@Service //트랜잭션 관리, 서로 다른 도메인 연, 컨트롤러와 레포 사이에서 중계역할
@Transactional //: Service안에 메소드가 호출되면, 트랜잭션 관리를 하겠다. save, update, delete를 위해서
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public Optional<User> findById(Long id) {
		return userRepository.findById(id);
	}
}

