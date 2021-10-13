package com.hsbc.service;
import java.util.Collection;
import java.util.List;
import com.hsbc.bean.Employee;
import com.hsbc.exceptions.EmployeeAlreadyPresentException;
import com.hsbc.exceptions.NoEmplyeeWithIdException;

public interface EmployeeService {
	
	public void save(Employee employee) throws EmployeeAlreadyPresentException ;
    public Collection<Employee> displayAll();
    public Employee findByID(int id) throws NoEmplyeeWithIdException;
    public void updateName(int id,String name) throws NoEmplyeeWithIdException;
    public void setSalary(int id,double salary) throws NoEmplyeeWithIdException;

}
