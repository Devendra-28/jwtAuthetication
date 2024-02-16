package com.jwt.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;



@Service
public class UserService {
	
	List<User> store= new ArrayList<>();
	
	public UserService() {
	store.add(new User(UUID.randomUUID().toString(),"Devendra Barhate","devendra@dev.in"));
	store.add(new User(UUID.randomUUID().toString(),"Rushi Tendulkar","rushi@dev.in"));
	store.add(new User(UUID.randomUUID().toString(),"Rohit Patil","rohit@dev.in"));
	store.add(new User(UUID.randomUUID().toString(),"Ram Kumar","ram@dev.in"));
	}
	public List<User> getUser() {
		
		return this.store;
    }
}