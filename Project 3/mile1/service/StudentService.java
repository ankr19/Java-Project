package mile1.service;

import mile1.bean.Student;

public class StudentService {
	public int findNumberofNullMarks(Student s[])
	{
		int c=0;
		for(int i=0;i<s.length;i++)
		{
			try {
				s[i].getmarks();
			}
			catch(Exception e)
			{
				c++;
			}
		}
		return c;
	}
	
	//2nd Method
	public int findNumberofNullName(Student s[])
	{
		int nc=0;
		for(int i=0;i<s.length;i++)
		{
			try {
				s[i].getName();
			}
			catch(Exception e)
			{
				nc++;
			}
		}
		return nc;
	}
	
	//3rd Method
	public int findNumberofNullObject(Student s[])
	{
		int oc=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==null)
			{
				oc++;
			}
		}
		return oc;
	}

}