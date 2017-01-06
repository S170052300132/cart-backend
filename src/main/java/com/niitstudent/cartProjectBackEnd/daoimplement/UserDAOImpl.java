package com.niitstudent.cartProjectBackEnd.daoimplement;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	@SuppressWarnings("deprecation")
	@Transactional
		public List<User> list() {
		// TODO Auto-generated method stub
		String hql ="from User";
		@SuppressWarnings("unchecked")
		Query<User>  query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
		
	}
	@Transactional
	public User get(String id) {
		// TODO Auto-generated method stub
		return (User)sessionFactory.getCurrentSession().get(User.class,id);
	}
	@SuppressWarnings("deprecation")
	@Transactional
	public User validate(String id, String password) {
		// TODO Auto-generated method stub
		String hql ="from user where id='"+id+"' and password='"+password+"'";
		@SuppressWarnings("unchecked")
		Query<User> query = sessionFactory.getCurrentSession().createQuery(hql);
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
