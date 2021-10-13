package com.hsbc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.bean.Employee;
import com.hsbc.exceptions.EmployeeAlreadyPresentException;

public class EmployeeDaoJdbcImpl implements EmployeeDao {

	public void save(Employee employee) throws EmployeeAlreadyPresentException {
		try
		{
			Connection connection = DBConnection.establishedConnection();
			String exeQuery="insert into employee(name,id,salary) values(?,?,?)";
			PreparedStatement statement=connection.prepareStatement(exeQuery);
			statement.setString(1, employee.getName());
			statement.setInt(2, employee.getId());
			statement.setDouble(3, employee.getSalary());
			statement.executeUpdate();
			statement.close();
			connection.close();
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

	public Employee[] displayEmployee() {
		
		Employee[] employees = null;
		try {
			Connection connection = DBConnection.establishedConnection();
			String selectQuery = "select * from employee";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			ResultSet result = statement.executeQuery();
			List<Employee> employeesList = new ArrayList<Employee>();
			while(result.next()) {
				Employee employee = new Employee(); // id, name & salary will have default values
				employee.setId(result.getInt(1)); // 1st column value is assigned to id 
				employee.setName(result.getString(2)); // 2nd column is assigned to name
				employee.setSalary(result.getDouble(3)); // 3rd column is assigned to salary
				employeesList.add(employee);
			}
			employees = employeesList.toArray(new Employee[employeesList.size()]);
			result.close();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	public Employee findByID(int id) {
		
		Employee employees = new Employee();
		try {
			Connection connection = DBConnection.establishedConnection();
			String selectQuery = "select * from employee where id=?";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setInt(1, id);
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				employees.setId(result.getInt(1));
				employees.setName(result.getString(2));
				employees.setSalary(result.getDouble(3));
			}
			result.close();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return employees;
		
	}

	public void updateEmployee(int id, Employee emp) {
		
		Employee employees = new Employee();
		try {
			Connection connection = DBConnection.establishedConnection();
			String selectQuery = "update employee set name=?,salary=? where id=?";
			PreparedStatement statement = connection.prepareStatement(selectQuery);
			statement.setString(1, emp.getName());
			statement.setDouble(2,emp.getSalary());
			statement.setInt(3,emp.getId());
			statement.executeUpdate();
			statement.close();
			connection.close();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
