// Main Student program to run the program
package mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student data[]=new Student[4];
	StudentMain()
	{
		for(int i=0;i<data.length;i++)
		{
			data[i]=new Student();
		}
	}
	static {
		// initializing the object 
		data[0]= new Student("Sekar", new int[]{85,75,95});
		data[1]=new Student(null, new int[]{11,22,33});
		data[2]=null;
		data[3]=new Student("Manoj",null);
	}
	public static void main(String[] args) {
		StudentReport sr=new StudentReport();
		StudentService ss=new StudentService();
		String s=null;
		System.out.println("Calculating Grade");
		for(int i=0;i<data.length;i++)
		{
			try {
				s=sr.validate(data[i]);
				if(s.equals("VALID"))
				{
					String g=sr.findGrades(data[i]);
					System.out.println("Grade = "+g);
				}
			}
			catch(NullNameException e)
			{
				e.printStackTrace();
			}
			catch(NullMarksArrayException e)
			{
				e.printStackTrace();
			}
			catch(NullStudentObjectException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Number of object with Marks array as null = "+ss.findNumberofNullMarks(data));
		System.out.println("Number of object with Name as null = "+ss.findNumberofNullName(data));
		System.out.println("Number of object as Null = "+ss.findNumberofNullObject(data));
		}
}