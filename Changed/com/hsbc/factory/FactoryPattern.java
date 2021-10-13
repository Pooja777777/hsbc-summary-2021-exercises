package com.hsbc.factory;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoListImpl;
import com.hsbc.dao.EmployeeDaoTreeSetImpl;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class FactoryPattern {
	
	public static EmployeeDao getDaoInstance(int i)
	{
		if(i==1)
		    return new EmployeeDaoListImpl();
		else
			return new EmployeeDaoTreeSetImpl();
	}
	public static EmployeeService getServiceInstance(EmployeeDao dao)
	{
		return new EmployeeServiceImpl(dao);
	}

}
