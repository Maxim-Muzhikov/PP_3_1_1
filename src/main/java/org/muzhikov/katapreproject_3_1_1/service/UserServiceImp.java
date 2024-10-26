package org.muzhikov.katapreproject_3_1_1.service;

import org.muzhikov.katapreproject_3_1_1.dao.UserDao;
import org.muzhikov.katapreproject_3_1_1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
	
	private final UserDao userDao;
	
	@Autowired
	public UserServiceImp(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@Override
	public List<User> getAll() {
		return userDao.findAll();
	}
	
	@Override
	public User getById(Long id) {
		return userDao.getReferenceById(id);
	}
	
	@Override
	public void save(User user) {
		userDao.save(user);
	}
	
	@Override
	public void delete(Long id) {
		userDao.deleteById(id);
	}
	
	@Override
	public void delete(User user) {
		userDao.delete(user);
	}
}
