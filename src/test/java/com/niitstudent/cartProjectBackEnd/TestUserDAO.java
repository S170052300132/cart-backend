package com.niitstudent.cartProjectBackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niitstudent.cartProjectBackEnd.dao.UserDAO;
import com.niitstudent.cartProjectBackEnd.domainobj.User;

public class TestUserDAO {
	
	@Autowired
	UserDAO userDAO;
	
	@Autowired
	User user;
	
	@Autowired
	AnnotationConfigApplicationContext context; 
	
	public TestUserDAO()
	{	context =new AnnotationConfigApplicationContext();
		context.scan("com.niitstudent.cartProjectBackEnd");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAOImpl");
		user = (User) context.getBean("user");
	}
	public boolean validate(String id , String password)
	{
		if (userDAO.validate(id, password)==null)
		{System.out.println("user does not exist");
					return false ;}
		else{return true ;}
	}
	
	public static void main(String[]args)
	{
		TestUserDAO t = new TestUserDAO();
		t.validate("admin1", "admin1");
	}

}
