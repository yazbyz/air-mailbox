package io.yazbyz.toypj.airmailbox.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)	//JUnit5 버전
// @RunWith(SpringRunner.class) 	//JUnit4 버전
// RunWith: 테스트가 실행될 환경 설정. SpringRunner.class: 스프링프레임워크로 설정.
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.NONE)
class UserServiceTest {

	@Autowired
	UserService userService;

	@Test    //@Test(expected=RuntimeException.class). JUnit5부터 expectThrows 사용불가. assertThrows만 허용.
	public void testFindById() {
		assertThrows(RuntimeException.class,
			() -> {
				Long id = 1L;
				userService.findById(id)
					.orElseThrow(() -> new RuntimeException("Not Found"));
			});
	}


}