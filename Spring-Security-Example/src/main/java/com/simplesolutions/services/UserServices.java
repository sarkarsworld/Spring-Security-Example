package com.simplesolutions.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.simplesolutions.models.User;

@Service
public class UserServices {
	
	List<User> list = new ArrayList<>();
	
	public UserServices() {
		list.add(new User("abc", "abc", "abc@abc.com"));
		list.add(new User("xyz", "xyz", "xyz@xyz.com"));
	}
	
	public List<User> getAllUsers(){
		return this.list;
	}

	public User getUser(String username) {
		return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
	}
	
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
}
