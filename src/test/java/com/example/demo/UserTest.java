package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest
public class UserTest {

	@Autowired
	private UserRepository repository;	
	
	@Test
	@DisplayName("유저생성 테스트")
	public void 유저생성() {
		// Given
		User user = new User("11", "테스트");
		
		// When
		repository.save(user);
				
		//Then
		User getUser = repository.findById("11").orElse(null);			
		assertThat(getUser.getId()).isEqualTo(user.getId());		
		assertThat(getUser.getName()).isEqualTo(user.getName());
	}
}
