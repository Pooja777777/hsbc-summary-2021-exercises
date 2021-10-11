package com.hsbc.viewController;
import java.util.Scanner;
import com.hsbc.beans.Employee;
import com.hsbc.exception.EmployeeAlreadyPresent;
import com.hsbc.exception.NoEmployeeFoundWithThisID;
import com.hsbc.factory.FactoryClass;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

@SuppressWarnings("unused")
public class ViewController {
	
	public static void main(String []args)
	{
		EmployeeService empService = FactoryClass.getServiceInstance();
		Scanner sn = new Scanner(System.in);
		int input=0;
		do
		{
			System.out.println("Press 1 to add Employee\nPress 2 to display Employee"
					+"\nPress 3 to find Employee by id "+"\nPress 4 to update Name"
					+"\nPress 5 to update Salary"+"\nPress 0 to Exit");
			input = sn.nextInt();
			switch(input)
			{
			case 1:
				try {
					Employee emp = new Employee();
					System.out.println("Enter the details of Employee");
					System.out.println("Enter the id");
					emp.setId(sn.nextInt());
					System.out.println("Enter the name");
					emp.setName(sn.next());
					System.out.println("Enter the salary");
					emp.setSalary(sn.nextDouble());
					empService.save(emp);
				} catch (EmployeeAlreadyPresent e1) {
					System.out.println(e1.getMessage());
				}
				break;
			case 2:
				Employee [] employee = empService.displayAll();
				for(Employee empDisplay:employee)
				{
					System.out.println(empDisplay);
				}
				break;
			case 3:
				try
				{
					System.out.println("Enter the id of Employee");
					int id = sn.nextInt();
					Employee empById = empService.findByID(id);
					System.out.println(empById);
				} catch (NoEmployeeFoundWithThisID e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try 
				{
					System.out.println("Enter the id");
					int empid=sn.nextInt();
					System.out.println("Enter the updated name");
					String empName=sn.next();
					empService.updateName(empid, empName);
				} catch (NoEmployeeFoundWithThisID e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try 
				{
					System.out.println("Enter the id");
					int employeeId=sn.nextInt();
					System.out.println("Enter the updated salary");
					double empSalary=sn.nextDouble();
					empService.setSalary(employeeId, empSalary);
				} catch (NoEmployeeFoundWithThisID e) {
					System.out.println(e.getMessage());
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