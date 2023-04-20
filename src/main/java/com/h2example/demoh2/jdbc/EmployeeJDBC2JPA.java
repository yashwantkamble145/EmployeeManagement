package com.h2example.demoh2.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.h2example.demoh2.entity.Employee2JAP;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmployeeJDBC2JPA {
	
	 @PersistenceContext
     EntityManager entitymanager;

	
	 public Employee2JAP findById(int id)
	 {
		 return entitymanager.find(Employee2JAP.class, id);
	 }

	 public Employee2JAP insert(Employee2JAP employeejpa)
	 {
		 return entitymanager.merge(employeejpa);
	 }
	 
	 public Employee2JAP update(Employee2JAP employeejpa)
	 {
		 return entitymanager.merge(employeejpa);
		 
	 }
	 public void deleteByID(int id)
	 {
		 Employee2JAP employeejpa=findById(id);
		  entitymanager.remove(employeejpa);
	 }
	 
	 public List<Employee2JAP> findAll(){
			TypedQuery<Employee2JAP> namedQuery= entitymanager.createNamedQuery("find_all_employee",Employee2JAP.class);//JPQL
			return namedQuery.getResultList();
		}

	

}
