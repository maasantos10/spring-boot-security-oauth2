package com.mas.spring.mvc.service;

import java.util.List;

import com.mas.spring.mvc.model.User;

/**
 * MAS - OAuth2
 * 
 */

public interface UserService {

	public List<User> findAllUsers(); 
	
	public boolean isUserExist(User user);
	
	public User findById(long id);
	
	public User findByName(String name);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUserById(long id);	
	
	public void deleteAllUsers();
}
