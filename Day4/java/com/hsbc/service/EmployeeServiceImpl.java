package com.hsbc.service;
import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDao dao=null;	
	
	public EmployeeServiceImpl() {
		this.dao = new EmployeeDaoImpl();
	}

	public void save(Employee employee) {
		
		dao.save(employee);
	}

	public Employee[] displayAll() {
		
		return dao.displayEmployee();
	}

	public Employee findByID(int id) {
		
		return dao.findByID(id);
    }

	public void updateName(int id, String name) {
		
		dao.updateName(id, name);
	}

	public void setSalary(int id, double salary) {
		
		dao.updateSalary(id, salary);
	}

}
