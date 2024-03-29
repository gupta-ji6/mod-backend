package com.project.mod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.mod.model.User;
import com.project.mod.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;

	@Override
	public User create(User user) {
		return repository.save(user);
	}

	@Override
	public User delete(int id) {
		User user = findById(id);
		if(user!=null) {
			repository.delete(user);
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findById(int id) {
		return repository.findOne(id);
	}

	@Override
	public User update(User user) {
		return repository.save(user);
	}
	
	@Override
	public User findUser(String role, String userName, String password) {
		return repository.findUser(role, userName, password);
	}
}
