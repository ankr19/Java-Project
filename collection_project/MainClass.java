// Main Class of the project Employee Management System

package com.main;

import java.util.List;
import java.util.Scanner;

import com.wipro.bean.EmployeeBean;
import com.wipro.service.EmployeeService;

public class MainClass
{
	public static void main(String[] args)
	{
		String name,designation;
		int empid;
		float salary;
		try
		{
			Scanner ss =new Scanner(System.in);
			EmployeeService ems=new EmployeeService();
			System.out.println("Enter number of employee to insert");
			int n=ss.nextInt();
			System.out.println("Enter the Employee details");
			for(int i=1;i<=n;i++)
			{
				ss=new Scanner(System.in);
				System.out.println("Enter the employee id,name, designation and salary of employee");
				empid=ss.nextInt();
				ss=new Scanner(System.in);
				name=ss.nextLine();
				designation=ss.nextLine();
				salary=ss.nextFloat();
				if(true==ems.insertEmployee(new EmployeeBean(empid,name,salary,designation)))
				{
					System.out.println("Employee Details is successfull added");
				}
				else
				{
					i--;
					System.out.println("Please Re-insert the details");
				}
			}
			// using the while and switch to get employee service to work
			boolean choice1=true;
			while(choice1!=false)
			{
				System.out.println("Enter the choice of u want to do");
				System.out.println("1: Insert the employee at the Position");
				System.out.println("2: Delete the details of the employee");
				System.out.println("3: Updating the employee details");
				System.out.println("4: Find the employee details");
				System.out.println("5: Fetching the details and displaying the details");
				int choice=ss.nextInt();
				switch(choice)
				{
				//
				case 1:
					// inserting the value the position
					System.out.println("Enter the position and empid,name,designation and salary of the Employee");
					int pos=ss.nextInt();
					empid=ss.nextInt();
					ss=new Scanner(System.in);
					name=ss.nextLine();
					designation=ss.nextLine();
					salary=ss.nextFloat();
					System.out.println(ems.insertEmployeeByPosition(new EmployeeBean(empid,name,salary,designation),pos));
					break;
					//===========================================================
				case 2:
					// delete the employee details
					System.out.println("Enter the employee id to delete the details of employee");
					empid=ss.nextInt();
					if(ems.deleteEmployeeByEmpId(empid)==true)
					{
						System.out.println("Employee details are delete successfully");
					}
					else 
					{
						System.out.println("Employee id is incorrect");
					}
					break;
				//===================================================
				case 3:
					//updating the employee details
					System.out.println("Enter the Employee details to update it empid, name, designation & salary");
					empid=ss.nextInt();
					ss=new Scanner(System.in);
					name=ss.nextLine();
					designation=ss.nextLine();
					salary=ss.nextFloat();
					if(ems.updateEmployeeByEmpID(new EmployeeBean(empid,name,salary,designation))==true)
					{
						System.out.println("update successful");
					}
					else
					{
						System.out.println("invalid employee id");
					}	
					break;
					//======================================================
				case 4:
					// finding the employee details
					System.out.println("Enter the employee id to find the employee details");
					empid=ss.nextInt();
					EmployeeBean bean = ems.findEmployeeByEmpId(empid);
					if(bean!=null)
					{
						System.out.println(bean.toString());
					}
					break;
					//====================================================
				case 5:
					// fetching and displaying the data of the Employee
					List<EmployeeBean> li=ems.fetchAllEmployee();
					ems.displayAll(li);
					break;
					default:
						System.out.println("Invalid choice");
						break;
				}
				// making the choice to continue the functions or not
				System.out.println("Enter the choice to true for continue or false for break");
				choice1=ss.nextBoolean();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
