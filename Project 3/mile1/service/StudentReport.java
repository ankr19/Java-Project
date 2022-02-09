package mile1.service;

import mile1.bean.Student;
import mile1.exception.NullMarksArrayException;
import mile1.exception.NullNameException;
import mile1.exception.NullStudentObjectException;

public class StudentReport {
	public String findGrades(Student studentobject)
	{
		int marks[]=studentobject.getmarks();
		int sum=0;
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]<=35)
			{
				return "F";
			}
			else {
				sum=sum+marks[i];
			}
		}
		// now checking the sum 
		if(sum<150)
		{
			return "C";
		}
		else if(sum>150 && sum<200)
		{
			return "B";
		}
		else if(sum>200 && sum<250)
		{
			return "A";
		}
		else 
		{
			return "A+";
		}
	}
	// 2nd Method
	public String validate(Student s) throws NullMarksArrayException,NullNameException,NullStudentObjectException{
		if(s==null)
		{
			throw new NullStudentObjectException();
		}
		else 
		{
			if(s.getName()==null)
			{
				throw new NullNameException();
			}
			else if(s.getmarks()==null)
			{
				throw new NullMarksArrayException();
			}
			else 
				return "VALID";
		}
	}

}
