package io.yazbyz.toypj.airmailbox.domain;

import static org.assertj.core.api.Assertions.*;
// import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)	//JUnit5 버전
// @RunWith(SpringRunner.class) 	//JUnit4 버전
@DataJpaTest
class UserRepositoryTest {

	@Autowired
	UserRepository repository;

	@Test
	public void testSave() {
		User user = new User();
		user.setName("HJ");
		user.set_id("yazbyz");
		user.setPw("123");

		assertThat(user.isNew()).isTrue();

		repository.save(user);

		assertThat(user.isNew()).isFalse();
	}

	@Test
	public void testFindByNameLike() {
		User user = new User();
		user.setName("HJ");
		user.set_id("yazbyz");
		user.setPw("123");

		repository.save(user);

		List<User> users = repository.findByNameLike("%HJ%");
		assertThat(users).isNotEmpty();

		users = repository.findByNameLike("c");
		assertThat(users).isEmpty();

	}

}