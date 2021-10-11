package com.hsbc.dao;
import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyPresent;

public interface EmployeeDao
{
	public void save(Employee employee) throws EmployeeAlreadyPresent;
	public Employee[] displayEmployee();
	public Employee findByID(int id);
	public void updateEmployee(int id,Employee emp);
}