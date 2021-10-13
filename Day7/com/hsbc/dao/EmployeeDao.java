package com.hsbc.dao;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.hsbc.bean.Employee;
import com.hsbc.exceptions.EmployeeAlreadyPresentException;

public interface EmployeeDao {

	public void save(Employee employee) throws EmployeeAlreadyPresentException;
	public Employee[] displayEmployee();
	public Employee findByID(int id);
	public void updateEmployee(int id,Employee emp);
	
}
