package com.niitstudent.cartProjectBackEnd.daoimplement;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niitstudent.cartProjectBackEnd.dao.UserDAO;
import com.niitstudent.cartProjectBackEnd.domainobj.User;
@Repository

public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
		public List<User> list() {
		// TODO Auto-generated method stub
		String hql ="from User";
	Query  query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}
	
	@Transactional
	public User get(String id) {
		// TODO Auto-generated method stub
		return (User)sessionFactory.getCurrentSession().get(User.class,id);
	}
	@Transactional
	public User validate(String id, String password) {
		// TODO Auto-generated method stub
		String hql ="from user where id='"+id+"' and password='"+password+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return (User)query.uniqueResult();
	}
	
	@Transactional
	public boolean save(User user) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}
	
	@Transactional
	public boolean update(User user) {
		// TODO Auto-generated method stub
		 
	sessionFactory.getCurrentSession().update(user);
	return false;
	}

}
