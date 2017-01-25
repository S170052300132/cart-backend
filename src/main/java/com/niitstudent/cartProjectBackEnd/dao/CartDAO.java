package com.niitstudent.cartProjectBackEnd.dao;


import java.util.List;
import com.niitstudent.cartProjectBackEnd.domainobj.Cart;


public interface CartDAO {

	public List<Cart> list(String id);

	public Cart get(String id);
	
	public void saveOrUpdate(Cart Cart);

	public void delete(String id);
	
	public int getTotalAmount(String id);


}
