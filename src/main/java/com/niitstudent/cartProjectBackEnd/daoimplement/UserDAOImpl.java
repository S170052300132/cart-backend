package com.niitstudent.cartProjectBackEnd.daoimplement;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niitstudent.cartProjectBackEnd.dao.UserDAO;
import com.niitstudent.cartProjectBackEnd.domainobj.User;
@SuppressWarnings({ "unused", "deprecation" })
@Repository
public class UserDAOImpl implements UserDAO {

	// You required session factory -> in application context config

	@Autowired
	private SessionFactory sessionFactory;

	// How get initialize
	// At the time of creation of instance , you have pass sessionFactory

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings({ "unchecked" })
	@Transactional
	public List<User> list() {

		String hql = "from User";

		@SuppressWarnings({ "rawtypes" })
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return query.list();

	}
	//If the valid id -> will return user domain object
	//If the invalid id -> will return null
	@Transactional
	public User get(String id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);

	}

	// select * from user where id ='niit' and password='niit'
	//If the credentials are valid  -> will return user domain object
		//If the invalid credentials -> will return null
	@Transactional
	public User validate(String id, String password) {
		String hql = "from User where id ='" + id + "'  and password='" + password + "'";

		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return (User) query.uniqueResult();

	}
	@Transactional
	public boolean save(User user) {

		try {
			sessionFactory.getCurrentSession().save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
	@Transactional
	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
