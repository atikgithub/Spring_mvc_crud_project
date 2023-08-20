package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.jsp.dto.Employee;

@Component
public class EmployeeDao {
	public Employee saveEmployee(Employee employee) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (employee != null) {
			entityTransaction.begin();
			entityManager.persist(employee);
			entityTransaction.commit();
		}
		return employee;
	}

	public Employee updateEmployee(Employee employee) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee2 = entityManager.find(Employee.class, employee.getId());
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (employee2 != null) {
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		return employee2;
	}

	public Employee deleteEmployee(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employee = entityManager.find(Employee.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		return employee;
	}
	 public List<Employee> getAllEmployees() {
		 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		  EntityManager entityManager=entityManagerFactory.createEntityManager();
		  EntityTransaction entityTransaction=entityManager.getTransaction();
		  Query query= entityManager.createQuery("select a from Employee a");
		  
		return query.getResultList();  	  
	  }
	  
	  public Employee getAllEmployeeById(int id) {
		  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		  EntityManager entityManager=entityManagerFactory.createEntityManager();
		  return entityManager.find(Employee.class, id);
		  
	  }

}
