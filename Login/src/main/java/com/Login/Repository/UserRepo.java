package com.Login.Repository;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Login.Module.User;

public interface UserRepo extends JpaRepository<User,Integer> {

	
	@Query(value="select * from fbdb where username=username or email=email",nativeQuery = true)
	User findByUsernameorEmail(String username,String email);
}
