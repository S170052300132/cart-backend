package com.niitstudent.cartProjectBackEnd.daoimplement;

import com.niitstudent.cartProjectBackEnd.dao.UserDAO;

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean isValidInfo(String uname, String pass) {
		
		// TODO Auto-generated method stub
		if (uname.equals("niit") && pass.equals("niit"))
		{return true;
		
		}
		else
		{return false;
		
		}
	}

}
