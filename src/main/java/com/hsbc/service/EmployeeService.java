package com.hsbc.service;

import com.hsbc.beans.Employee;

public interface EmployeeService {
	
	public void save(Employee employee);
    public Employee[] displayAll();
    public Employee findByID(int id);
    public void updateName(int id,String name);
    public void setSalary(int id,double salary);
}
