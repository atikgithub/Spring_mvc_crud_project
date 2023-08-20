package com.jsp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.jsp.dao.EmployeeDao;
import com.jsp.dto.Employee;


@Component
public class EmployeeService {
  @Autowired
  EmployeeDao dao;
  public Employee saveEmployee(Employee employee) {
		return dao.saveEmployee(employee);
	}
  public Employee updateEmployee(Employee employee ) {
	  return dao.updateEmployee(employee);
  }
  public Employee getEmployeeById(int id) {
	  return dao.getAllEmployeeById(id);
  }
  public Employee deleteEmployeeById(int id) {
	  return dao.deleteEmployee(id);
  }
  public List<Employee> getAllEmployee() {
		return dao.getAllEmployees();
	}
}
