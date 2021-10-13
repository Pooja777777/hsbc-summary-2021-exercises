package com.hsbc.factory;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.dao.EmployeeDaoImpl;
import com.hsbc.dao.EmployeeDaoJdbcImpl;
import com.hsbc.dao.EmployeeDaoListImpl;
import com.hsbc.dao.EmployeeDaoTreeSetImpl;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class FactoryPattern {
	
	public static EmployeeDao getDaoInstance(int i)
	{
		if(i==1)
		    return new EmployeeDaoImpl();
		else if(i==2)
			return new EmployeeDaoListImpl();
		else if(i==3)
			return new EmployeeDaoTreeSetImpl();
		else if(i==4)
			return new EmployeeDaoJdbcImpl();
		else
			return new EmployeeDaoImpl();
	}
	public static EmployeeService getServiceInstance(EmployeeDao dao)
	{
		return new EmployeeServiceImpl(dao);
	}

}
