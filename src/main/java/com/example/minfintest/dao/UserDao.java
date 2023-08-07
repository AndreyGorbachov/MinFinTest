package com.example.minfintest.dao;

import com.example.minfintest.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {

	User findByLogin(String login);

}
