package com.hsbc.dao;

import com.hsbc.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private static Employee [] employees = new Employee [10];
	private static int counterEmployee=0;
	
	public void save(Employee employee) 
	{
		employees[counterEmployee] = employee;
		counterEmployee++;
	}

	public Employee[] displayEmployee() {
		Employee [] displayEmployees = new Employee[counterEmployee];
		for(int index=0;index<counterEmployee;index++)
		{
			displayEmployees[index]=employees[index];
		}
		return(displayEmployees);
	}

	public Employee findByID(int id) {
		for(Employee emp:employees)
		{
			if(emp.getId()==id)
				return(emp);
		}
		return null;
	}

	public void updateName(int id,String name) {
		for(int index=0;index<counterEmployee;index++)
		{
			if(employees[index].getId()==id)
			{
				employees[index].setName(name);
			}
		}
		
	}

	public void updateSalary(int id, double salary) {
		
		for(int index=0;index<counterEmployee;index++)
		{
			if(employees[index].getId()==id)
			{
				employees[index].setSalary(salary);;
			}
		}
	}

	
}
