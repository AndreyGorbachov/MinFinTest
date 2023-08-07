package com.example.minfintest;

import com.example.minfintest.dao.UserDao;
import com.example.minfintest.model.User;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MinFinTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinFinTestApplication.class, args);
	}

	@Bean
	public ApplicationRunner dataLoader(UserDao userDao, PasswordEncoder passwordEncoder) {
		return args -> {
			String login = "user";
			String password = "password";
			User user = userDao.findByLogin(login);
			if (user == null) {
				userDao.save(new User(login, passwordEncoder.encode(password)));
			}
		};
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
