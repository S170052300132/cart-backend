package com.niitstudent.cartProjectBackEnd.domainobj;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

//map to specific database entity (Table)
//Which table you have map
//Create Singleton instance/object

@Entity
@Table    //if the table name and domain object name is same
@Component     //user instance       // do not use User u = new User()
public class User {
	
	
	//what are the properties  same as db table fields
	@Id     //To specify this field is primary key
	private String id;
	
	private String name;
	
	private String password;
	
	private String email_id;
	
	private String mobile_no;
	
	
	private String role;


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getemail_id() {
		return email_id;
	}


	public void setemail_id(String email_id) {
		this.email_id = email_id;
	}


	public String getmobile_no() {
		return mobile_no;
	}


	public void setmobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	

}
