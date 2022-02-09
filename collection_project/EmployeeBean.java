// class to used the detail for employee
package com.bean;

public class EmployeeBean
{
	private int empID;
	private String name;
	private float salary;
	private String designation;
	public EmployeeBean(int empID,String name,float salary,String designation)
	{
		super();
		this.empID=empID;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
	}
	// using setter and getter method for name
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	// using setter and getter method for EmpID
	public void setempID(int empID)
	{
		this.empID=empID;
	}
	public Integer getempID()
	{
		return empID;
	}
	
	// using setter and getter method for salary
	public void setSalary(float salary)
	{
		this.salary=(float)salary;
	}
	public Float getSalary()
	{
		return salary;
	}
	
	// using setter and getter method for designation
	public void setDesignation(String designation)
	{
		this.designation=designation;
	}
	public String getDesignation()
	{
		return designation;
	}
	
	// using the printing method
	@Override
	public String toString()
	{
		return (empID+" "+name+" "+salary+" "+designation);
	}
	
}
