package Lesson_3;

import Lesson_4.Employee;

public class My13 
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My13");
		Employee[] staff = new Employee[8];
		staff[0]=new Employee("Haug E.J.", 50000);
		Employee.setId(100);
		staff[1]=new Employee("Adams R.A.", 60000);
		staff[2]=new Employee("Taylor A.A.", 35000);
		staff[3]=new Employee("Mitchel A.R.");
		staff[4]=new Employee(17000);
		staff[5]=new Employee(14000);
		staff[6]=new Employee();
		staff[7]=new Employee();
		for (int i=0; i<staff.length;i++)
		{
			Employee e = staff[i];
			System.out.println("id="+e.getId()+"name="+e.getName()+" salary="+e.getSalary());
			
		}
		System.out.println("--------");
		for (int i=0; i<staff.length;i++)
		{
			Employee e = staff[i];
			if (e.equals(15000)>0)
			System.out.println("id="+e.getId()+"name="+e.getName()+" salary="+e.getSalary());
			
		}
		System.out.println("--------");
		for (int i=0; i<staff.length;i++)
			for (int j=0; j<staff.length;j++)
				if (staff[i].equals(staff[j])<0)
				{
					Employee e = staff[i];staff[i]=staff[j];staff[j]=e;
					
				}
		for (int i=0; i<staff.length;i++)
		{
			Employee e = staff[i];
			System.out.println("id="+e.getId()+"name="+e.getName()+" salary="+e.getSalary());
			
		}
	}	
}
