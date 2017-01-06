package com.niitstudent.cartProjectBackEnd.domainobj;

import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component

public class User {
	
	public String id;
	public String name;
	public String password;
	public String email_id;
	public String mobile_no;
	public String role;

	

}
