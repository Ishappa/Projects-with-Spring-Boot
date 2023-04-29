package com.Login.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Login.Exception.ResourceNotFoundException;
import com.Login.Module.User;
import com.Login.Repository.UserRepo;
import com.Login.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	@Override
	public User addUser(User u) {
		
		return repo.save(u);
	}
	@Override
	public Object login(String usernameOrEmail,String Password) {
		
		User u=repo.findByUsernameorEmail(usernameOrEmail, usernameOrEmail);
		if(u!=null) {
			if(Password.equals(u.getPassword())) {
				return u;
			
		}
		else {
			try {
				throw new ResourceNotFoundException("user","usernameOrEmail",usernameOrEmail);
			}
			catch(ResourceNotFoundException e) {
				return e;
			}
		}
	}
		else {
			try {
				throw new ResourceNotFoundException("user","usernameOrEmail",usernameOrEmail);
			}
			catch(ResourceNotFoundException e){
				return e;
			}
		}
		
	}
	
}
