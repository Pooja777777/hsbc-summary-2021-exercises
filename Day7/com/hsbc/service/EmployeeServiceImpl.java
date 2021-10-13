package com.hsbc.service;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import com.hsbc.bean.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.exceptions.EmployeeAlreadyPresentException;
import com.hsbc.exceptions.NoEmplyeeWithIdException;
import com.hsbc.factory.FactoryPattern;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao dao;
	
	public EmployeeServiceImpl(EmployeeDao dao) {
		super();

				this.dao = dao;;
	}

	public void save(Employee employee) throws EmployeeAlreadyPresentException {
		
		dao.save(employee);
		
	}

	public Employee[] displayAll() {
		
		Employee[] emp = dao.displayEmployee();
		return emp;
	}

	public Employee findByID(int id) throws NoEmplyeeWithIdException {
		
		Employee emp = dao.findByID(id);
		if(emp==null)
			throw new NoEmplyeeWithIdException("No Employee is present with id "+id);
		return(emp);
	}

	public void updateName(int id, String name) throws NoEmplyeeWithIdException{
		
		Employee emp = dao.findByID(id);
		if(emp==null)
			throw new NoEmplyeeWithIdException("No Employee is present with id "+id);
		emp.setName(name);
		dao.updateEmployee(id, emp);
	}

	public void setSalary(int id, double salary) throws NoEmplyeeWithIdException{
		
		Employee emp = dao.findByID(id);
		if(emp==null)
			throw new NoEmplyeeWithIdException("No Employee is present with id "+id);
		emp.setSalary(salary);
		dao.updateEmployee(id, emp);
	}

}
