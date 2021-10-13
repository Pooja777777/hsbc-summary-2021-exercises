package com.hsbc.dao;
import com.hsbc.bean.Employee;
import com.hsbc.exceptions.EmployeeAlreadyPresentException;

public class EmployeeDaoImpl implements EmployeeDao{

	private static Employee [] employees = new Employee [10];
	private static int counterEmployee=0;
	
	public void save(Employee employee) throws EmployeeAlreadyPresentException
	{
		if(counterEmployee!=0)
		{
			for(int index=0;index<counterEmployee;index++)
			{
				if(employees[index].getId()==employee.getId())
			        throw new EmployeeAlreadyPresentException("Employee with "+employee.getId()+" is already present");
		    }
		}
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
		for(int index=0;index<counterEmployee;index++)
		{
			if(employees[index].getId()==id)
				return(employees[index]);
		}
		return null;
	}

	public void updateEmployee(int id, Employee emp) {
		for(int index=0;index<counterEmployee;index++)
		{
			if(employees[index].getId()==id)
			{
				employees[index]=emp;
			}
			
		}
		
	}

	
}