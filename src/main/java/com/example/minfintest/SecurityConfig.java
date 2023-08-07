package com.example.minfintest;

import com.example.minfintest.dao.UserDao;
import com.example.minfintest.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig {

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService userDetailsService(UserDao userDao) {
		return username -> {
			User user = userDao.findByLogin(username);
			if (user != null) {
				return user;
			}
			throw new UsernameNotFoundException("User " + username + " not found");
		};
	}

}
