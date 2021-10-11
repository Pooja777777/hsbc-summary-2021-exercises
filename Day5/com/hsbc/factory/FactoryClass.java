package com.hsbc.factory;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoImpl;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class FactoryClass {

	public static EmployeeDao getDaoInstance()
	{
		return new EmployeeDaoImpl();
	}
	public static EmployeeService getServiceInstance()
	{
		return new EmployeeServiceImpl();
	}
}
