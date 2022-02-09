package mile1.bean;

public class Student
{
	String name;
	int marks[];
	String grade;
	public Student()
	{
		
	}
	public Student(String name, int marks[])
	{
		super();
		this.name=name;
		this.marks=marks;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	public String getGrade()
	{
		return grade;
	}

	public void setMarks(int marks[])
	{
		this.marks=marks;
	}
	public int[] getmarks()
	{
		return marks;
	}
	
}
