package com.hsbc.service;
import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyPresent;
import com.hsbc.exception.NoEmployeeFoundWithThisID;

public interface EmployeeService {
	
	public void save(Employee employee) throws EmployeeAlreadyPresent;
    public Employee[] displayAll();
    public Employee findByID(int id) throws NoEmployeeFoundWithThisID;
    public void updateName(int id,String name) throws NoEmployeeFoundWithThisID;
    public void setSalary(int id,double salary) throws NoEmployeeFoundWithThisID;
}