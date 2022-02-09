package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.wipro.bean.EmployeeBean;

public class EmployeeService
{
	private List<EmployeeBean> listBean =new ArrayList<>();
	
	// for adding the employee data's
	public boolean insertEmployee(EmployeeBean bean)
	{
		if(listBean.add(bean))
			return true;
		else 
			return false;
	}
	
	// inserting the employees by positions
	public String insertEmployeeByPosition(EmployeeBean bean,int position)
	{
		if(position<listBean.size())
		{
			listBean.set(position,bean);
			return "Inserted employee at position:"+position;
		}
		else
		{
			insertEmployee(bean);
			position = listBean.indexOf(bean);
			return "Inserted employee at end-position:"+position;
		}
	}
	
	// fetching the ArrayList
	public List<EmployeeBean> fetchAllEmployee()
	{
		if(listBean!=null)
		{
			return listBean;
		}
		return(null);
	}
	
	// Deleting the employee detail if the employee id is on list
	public boolean deleteEmployeeByEmpId(int empID)
	{
		Iterator list=listBean.listIterator();
		int c=0; // for delete the right value
		while(list.hasNext())
		{
			if(((EmployeeBean)list.next()).getempID()==empID)
			{
				listBean.remove(c);
				return true;
			}
			c++;
		}
		return false;
	}
	
	// Updating the value
	public boolean updateEmployeeByEmpID(EmployeeBean bean)
	{
		Iterator<EmployeeBean> li=listBean.listIterator();
		while(li.hasNext())
		{
			EmployeeBean b1=li.next();
			if(b1.getempID()==bean.getempID())
			{
				b1.setName(bean.getName());
				b1.setSalary(bean.getSalary());
				b1.setDesignation(bean.getDesignation());
				return true;
			}
		}
		return false;
	}
	
	// finding the Employee Details 
	public EmployeeBean findEmployeeByEmpId(int EmpId)
	{
		Iterator li=listBean.listIterator();
		while(li.hasNext())
		{
			if(((EmployeeBean)li.next()).getempID()==EmpId)
			{
				return (EmployeeBean)li.next();
			}
		}
		return null;
	}
	
	// Printing the all the values 
	public void displayAll(List<EmployeeBean> li)
	{
		Iterator<EmployeeBean> itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	// Printing all values of the listBean
	public void display()
	{
		Iterator li=listBean.iterator();
		System.out.println("Id   Name   Salary   Designation");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}
}