package com.hsbc.viewController;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import com.hsbc.bean.Department;
import com.hsbc.bean.Employee;
import com.hsbc.dao.EmployeeDao;
import com.hsbc.exceptions.EmployeeAlreadyPresentException;
import com.hsbc.exceptions.NoEmplyeeWithIdException;
import com.hsbc.factory.FactoryPattern;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class ViewController {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);		
		int input=0,input1=1;
		EmployeeDao empDao;
		EmployeeService empService;
		System.out.println("1 for Array operation\n2 for List operations\n3 for TreeSet operations\n4 for JDBC operations");
		input1=sn.nextInt();
		empDao = FactoryPattern.getDaoInstance(input1);
		empService = FactoryPattern.getServiceInstance(empDao);
		
		do
		{
			System.out.println("Press 1 to add Employee\nPress 2 to display Employee"
					+"\nPress 3 to find Employee by id "+"\nPress 4 to update Name"
					+"\nPress 5 to update Salary"+"\nPress 0 to Exit");
			input = sn.nextInt();
			switch(input)
			{
			case 1:
					Employee emp = new Employee();
					System.out.println("Enter the details of Employee");
					System.out.println("Enter the id");
					emp.setId(sn.nextInt());
					System.out.println("Enter the name");
					emp.setName(sn.next());
					System.out.println("Enter the salary");
					emp.setSalary(sn.nextDouble());
				    System.out.println("Please Select Department"
				    		+ "\nPress 1 for SALES\nPress 2 for ACCOUNT"
				    		+ "\nPress3 for HR\nPress 4 for OPERATION");
				    int choices=sn.nextInt();
				    if(choices==1)
				    	emp.setDepartment(Department.SALES);
				    if(choices==2)
				    	emp.setDepartment(Department.ACCOUNT);
				    if(choices==3)
				    	emp.setDepartment(Department.HR);
				    if(choices==4)
				    	emp.setDepartment(Department.OPERATION);
				try {
					empService.save(emp);
				} catch (EmployeeAlreadyPresentException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				Employee[] employee = empService.displayAll();
				for(Employee empDisplay:employee)
				{
					System.out.println(empDisplay);
				}
				break;
			case 3:
					System.out.println("Enter the id of Employee");
					int id = sn.nextInt();
				Employee empById;
				try {
					empById = empService.findByID(id);
					System.out.println(empById);
				} catch (NoEmplyeeWithIdException e) {
					System.err.println(e.getMessage());
				}
				
				break;
			case 4:
					System.out.println("Enter the id");
					int empid=sn.nextInt();
					System.out.println("Enter the updated name");
					String empName=sn.next();
				try {
					empService.updateName(empid, empName);
				}   catch (NoEmplyeeWithIdException e) {
					System.err.println(e.getMessage());
				}
				
				break;
			case 5:
					System.out.println("Enter the id");
					int employeeId=sn.nextInt();
					System.out.println("Enter the updated salary");
					double empSalary=sn.nextDouble();
				try {
					empService.setSalary(employeeId, empSalary);
				}   catch (NoEmplyeeWithIdException e) {
					System.err.println(e.getMessage());
				}
				
				break;
			case 0: 
				System.exit(0);
			break;   
			}
		}while(input!=0);
		sn.close();
		
	}
}