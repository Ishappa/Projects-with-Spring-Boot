package com.Login.Controller;

 
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
 

import com.Login.Module.User;
import com.Login.Service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService s;
	 @PostMapping("/Adduser")
	 ResponseEntity<User> addUser(@RequestBody User u){
		 return new ResponseEntity<User>(s.addUser(u),HttpStatus.CREATED);
	 }
	 @GetMapping("/login")
	 ResponseEntity<Object> login(@RequestHeader String UsernameOrEmail,String Password)
	 {
		 Object o=s.login(UsernameOrEmail, Password);
		 if(o instanceof User)
		 {
			 return ResponseEntity.status(200).body(s.login(UsernameOrEmail, Password));
		 }
		 return ResponseEntity.status(400).body(s.login(UsernameOrEmail, Password));
			
	 }
	 
	
	
}
