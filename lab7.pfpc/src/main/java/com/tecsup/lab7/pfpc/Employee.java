package com.tecsup.lab7.pfpc;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID=1L;
	
	String firstName;
	String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
