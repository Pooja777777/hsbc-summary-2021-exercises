package com.hsbc.dao;

import com.hsbc.beans.Employee;

public interface EmployeeDao
{
	public void save(Employee employee);
	public Employee[] displayEmployee();
	public Employee findByID(int id);
	public void updateName(int id,String name);
	public void updateSalary(int id,double salary);
}