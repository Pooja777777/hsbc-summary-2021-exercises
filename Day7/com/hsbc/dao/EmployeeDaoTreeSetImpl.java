package com.hsbc.dao;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import com.hsbc.bean.Employee;
import com.hsbc.exceptions.EmployeeAlreadyPresentException;

public class EmployeeDaoTreeSetImpl implements EmployeeDao{

	private static Set<Employee> employees = new TreeSet<Employee>();
	
	public void save(Employee employee) throws EmployeeAlreadyPresentException {
	
		if(employees.size()!=0)
		{
			for(Employee emp:employees)
			{
				if(emp.getId()==employee.getId())
					throw new EmployeeAlreadyPresentException("Employee with id "+emp.getId()+" is already present");
			}
		}
		employees.add(employee);
		
	}

	public Employee[] displayEmployee() {
		Employee[] emp = employees.toArray(new Employee[employees.size()]);
		return emp;
	}

	public Employee findByID(int id) {
		for(Employee emp1:employees)
		{
			if(emp1.getId()==id)
				return emp1;
		}
		return null;
	}

	public void updateEmployee(int id, Employee emp) {
		for(Employee emp1:employees)
		{
			if(emp1.getId()==id)
			{
				   employees.remove(emp1);
				   employees.add(emp);
			}
		}
		
	}
	

}
