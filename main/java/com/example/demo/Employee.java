package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Employee {

	@Id

	private int employeeid;

	private String employeename;

	private String Email;

	private int Contact;

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public int getContact() {
		return Contact;
	}

	public void setContact(int contact) {
		this.Contact = contact;
	}

}