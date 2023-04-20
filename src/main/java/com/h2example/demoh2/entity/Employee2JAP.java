package com.h2example.demoh2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name="find_all_employee", query="select s from Employee2JAP s")//JPQL
public class Employee2JAP {
	
	
	
	public Employee2JAP() {
		
	}

	
	 @Id
	 @GeneratedValue
	 private int id;
	 private String firstname;
	 private String lastname;
	 private String Email;
	 private int Age;
	   
	 public Employee2JAP(int id, String firstname, String lastname, String email, int age) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.Email = email;
			this.Age  = age;
		}

	public int getEmpid() {
		return id;
	}

	public void setEmpid(int empid) {
		this.id = empid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Employee2JAP [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", Email="
				+ Email + ", Age=" + Age + "]";
	}
	   
	 
	   

	   
		
}
