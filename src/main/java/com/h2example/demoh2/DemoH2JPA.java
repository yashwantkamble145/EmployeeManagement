package com.h2example.demoh2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.h2example.demoh2.entity.Employee2JAP;
import com.h2example.demoh2.jdbc.EmployeeJDBC2JPA;



@SpringBootApplication
public class DemoH2JPA implements CommandLineRunner{
	@Autowired
	EmployeeJDBC2JPA Employeejdbcd;
   
	public static void main(String[] args) {
		SpringApplication.run(DemoH2JPA.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("welcome to findby id method");
    System.out.println(Employeejdbcd.findById(1));
		
//	System.out.println("welcome to insert method");
//    System.out.println(Employeejdbcd.insert(new employee2JAP(1,"Raj","verma","raj.verma@imagine.com" 35)));//bydefault id value=1
//		
		System.out.println("welcome to update method");
	    System.out.println(Employeejdbcd.update(new Employee2JAP(2,"Vaibhav","Talng","v.telang@futureready.com", 29)));
		
	/*	System.out.println("welcome to delete method");
		Employeejdbcd.deleteByID(1);*/
		
	//	System.out.println("welcome to findall method");
	  //  System.out.println(Employeejdbcd.findAll());

		
		
	}
	

}
