package com.niitstudent.cartProjectBackEnd.dao;

import java.util.List;

import com.niitstudent.cartProjectBackEnd.domainobj.Category;


public interface CategoryDAO {

	public List<Category> list();

	public Category get(String id);

	public Category getByName(String name);

	public void saveOrUpdate(Category category);

	public boolean delete(Category category);

	public void add(Category category);

	public void delete(String id);


}
