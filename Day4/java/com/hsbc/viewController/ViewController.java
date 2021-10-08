package com.hsbc.viewController;
import java.util.Scanner;
import com.hsbc.beans.Employee;
import com.hsbc.service.EmployeeService;
import com.hsbc.service.EmployeeServiceImpl;

public class ViewController {
	
	public static void main(String []args)
	{
		EmployeeService empService = new EmployeeServiceImpl();
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
				Employee emp = new Employee();
				System.out.println("Enter the details of Employee");
				System.out.println("Enter the id");
				emp.setId(sn.nextInt());
				System.out.println("Enter the name");
				emp.setName(sn.next());
				System.out.println("Enter the salary");
				emp.setSalary(sn.nextDouble());
				empService.save(emp);
				break;
			case 2:
				Employee [] employee = empService.displayAll();
				for(Employee empDisplay:employee)
				{
					System.out.println(empDisplay);
				}
				break;
			case 3:
				System.out.println("Enter the id of Employee");
				int id = sn.nextInt();
				Employee empById=empService.findByID(id);
				System.out.println(empById);
				break;
			case 4:
				System.out.println("Enter the id");
				int empid=sn.nextInt();
				System.out.println("Enter the updated name");
				String empName=sn.next();
				empService.updateName(empid, empName);
				break;
			case 5:
				System.out.println("Enter the id");
				int employeeId=sn.nextInt();
				System.out.println("Enter the updated salary");
				double empSalary=sn.nextDouble();
				empService.setSalary(employeeId, empSalary);
				break;
			case 0: 
				System.exit(0);
			break;   
			}
		}while(input!=0);
		sn.close();
	}

}
