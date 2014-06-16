package com.mycompany.apps.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.apps.entities.User;
import com.mycompany.apps.mappers.UserMapper;

/**
 * @author stnetadmin
 *
 */
@Repository
public class UserRepository {

	@Autowired
	private UserMapper userMapper;

	public User findUserById(Integer userId) {
		return userMapper.findUserById(userId);
	}

	public List<User> findAllUsers() {
		return userMapper.findAllUsers();
	}
}
