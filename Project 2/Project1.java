//project 1 of Java


//for finding the salary
class Salary
{
	public void add(int b,int h,int it,int da)
	{
		int sal;
		sal=(b+h+da)-it;
		System.out.print("\t"+sal);
	}
}

//main method
public class Project1
{

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		int ef;// for display that employee only
		int da=0;
		Salary s=new Salary();
		ef=Integer.parseInt(args[0]);
		//all employee detail in the string 
		String em[][]=new String[][] {{"1001","Ashish","R&D","e","01/04/2009","20000","8000","3000"},
            {"1002","Sushma","PM","c","23/08/2012","30000","12000","9000"},
            {"1003","Rahul","Acct","k","12/11/2008","10000","8000","1000"},
            {"1004","Chahat","Front Desk","r","29/01/2013","12000","6000","2000"},
            {"1005","Ranjan","Engg","m","16/07/2005","50000","20000","20000"},
            {"1006","Suman","Manufacturing","e","01/01/2000","23000","9000","4400"},
            {"1007","Tanmay","PM","c","12/06/2006","29000","12000","10000"}};
           // find the employee
            int flag=-1;
            point:for(int i=0;i<7;i++)
            {
            	if(Integer.parseInt(em[i][0])==ef)
            	{
            		flag=-1;
            		 System.out.println("EmpNo"+"\t"+"EmpName"+"\t"+"Department "+"\t"+"Designation"+"\t"+"Salary");
            		for(int j=0;j<4;j++)
            		{
            			/*if(j==1||j==2||j==4)
        				{
        					System.out.print("\t");
        				}*/
            			// switch 
        				switch(em[i][j])
        				{
        				case "e": System.out.print("\t"+"Engineer");
        				               da=20000; 
        				               s.add(Integer.parseInt(em[i][5]),Integer.parseInt(em[i][6]),Integer.parseInt(em[i][7]), da);
        				               break point;
        				case "c":System.out.print("\t"+"Consultant");
        				              da=32000; 
        				              s.add(Integer.parseInt(em[i][5]),Integer.parseInt(em[i][6]),Integer.parseInt(em[i][7]), da);
        				              break point;
        				case "k":System.out.print("\t"+"Clerk");
        				              da=12000;
        				              s.add(Integer.parseInt(em[i][5]),Integer.parseInt(em[i][6]),Integer.parseInt(em[i][7]), da);
        				              break point;
        				case "r":System.out.print("\t"+"Receptionlist");
        				              da=15000;
        				              s.add(Integer.parseInt(em[i][5]),Integer.parseInt(em[i][6]),Integer.parseInt(em[i][7]), da);
        				              break point;
        				case "m":System.out.print("\t"+"Manager");
        				                da=40000;
        				                s.add(Integer.parseInt(em[i][5]),Integer.parseInt(em[i][6]),Integer.parseInt(em[i][7]), da);
        				                 break point;
        				default:System.out.print(em[i][j]+"\t");
        				} 
            		}
            	}
            	else 
            	{
            		flag=0;
            	}
            }
		   if(flag==0)
		   {
			System.out.println("There is no employee with employee id "+ef);
		   }
		}
	
}