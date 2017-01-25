package com.niitstudent.cartProjectBackEnd.dao;

import java.util.List;
import com.niitstudent.cartProjectBackEnd.domainobj.User;

public interface UserDAO {
	
	public List<User> list();
	
	public User get(String id);
	
	public User validate(String id,  String password);
	
	public void saveOrUpdate(User user);
		
}
