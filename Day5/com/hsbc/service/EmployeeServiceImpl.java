package com.hsbc.service;
import com.hsbc.beans.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoImpl;
import com.hsbc.exception.EmployeeAlreadyPresent;
import com.hsbc.exception.NoEmployeeFoundWithThisID;
import com.hsbc.factory.FactoryClass;

@SuppressWarnings("unused")
public class EmployeeServiceImpl implements EmployeeService
{

	EmployeeDao dao=FactoryClass.getDaoInstance();
    
	public void save(Employee employee) throws EmployeeAlreadyPresent{
		
		dao.save(employee);
	}

	public Employee[] displayAll() {
		
		return dao.displayEmployee();
	}

	public Employee findByID(int id) throws NoEmployeeFoundWithThisID {
		
		Employee employee=dao.findByID(id);
		if(employee==null)
		{
			throw new NoEmployeeFoundWithThisID("No Employee Found of "+id);
		}
		else
		{
			return(employee);
		}
    }

	public void updateName(int id, String name) throws NoEmployeeFoundWithThisID {
		Employee emp=dao.findByID(id);
		emp.setName(name);
		dao.updateEmployee(id, emp);
	}

	public void setSalary(int id, double salary) throws NoEmployeeFoundWithThisID {
		Employee emp1=dao.findByID(id);
		emp1.setSalary(salary);
		dao.updateEmployee(id, emp1);
	}
}