package Lesson_3;


public class My12 
	{
		public static void main (String[] args)
		{
			System.out.println("It is program My");
		    Employee2[] staff = new Employee2[3];
		    staff[0]=new Employee2("Haug E.J.",50000);
		    staff [1]=new Employee2("Adams R.A.",60000);
		    staff [2]=new Employee2("Taylor A.A.",35000);
		    for (int i=0;i<staff.length;i++)
		    {
		    	System.out.println("name="+staff[i].getName()+" salary="+staff[i].getSalary());
		    }
		    System.out.println("--------New salary--------");
		    for (int i=0;i<staff.length;i++)
		    	staff[i].raiseSalary(10);
		    for (int i=0;i<staff.length;i++)
		    {   Employee2 e=staff[i];
		    	System.out.println("name="+e.getName()+" salary="+e.getSalary());
		    }
		    if (staff[1].setSalary(73000))
		    {
		    	Employee2 e=staff[1];
		    	System.out.println("name="+e.getName()+" salary="+e.getSalary());
		    } else
		    {
		    	System.out.println("error");
		    	Employee2 e=staff[1];
		    	System.out.println("name="+e.getName()+" old salary="+e.getSalary());
		    }
		    System.out.println("----------");
		    String[] s1={"less then","equal","more then"};
		    System.out.println("Salary of "+staff[0].getName()+" "+s1[staff[0].equals(staff[2])+1]+
		    		" salary of "+staff[2].getName());
		}
	}


