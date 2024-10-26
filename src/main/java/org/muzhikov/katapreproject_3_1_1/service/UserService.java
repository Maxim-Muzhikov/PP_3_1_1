package org.muzhikov.katapreproject_3_1_1.service;

import org.muzhikov.katapreproject_3_1_1.model.User;

import java.util.List;

public interface UserService {
	
	public List<User> getAll();
	
	public User getById(Long id);
	
	public void save(User user);
	
	public void delete(Long id);
	
	void delete(User user);
	
}
