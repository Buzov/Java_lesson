package My66;

import java.io.*;
import java.util.*;


public class My66
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My20");
		Employee[] staff = new Employee[4];
		staff[0]=new Employee("Haug E.J.", 150000, 2000);
		Manager m=new Manager("Adams R.A.", 60000, 2001);
		m.setBonus(5000);
		m.setSecretary(staff[0]);
		staff[1]=m;//new Employee("Adams R.A.", 60000, 2001);
		
		m=new Manager("Taylor A.A.", 35000, 1998);
		m.setBonus(10000);
		m.setSecretary(staff[0]);
		staff[2]=m;//new Employee("Taylor A.A.", 35000, 1998);
		staff[3]=new Employee("Mitchel A.R.", 43000, 1996);
	
		for (int i=0; i<staff.length;i++)
		
			System.out.println(staff[i].toString());
			System.out.println("----------------");
			try
			{
			ObjectOutputStream out=new ObjectOutputStream(
					new FileOutputStream("employee2.dat"));
			out.writeObject(staff);
			out.close();
			ObjectInputStream in=new ObjectInputStream(
					new FileInputStream("employee2.dat"));
			Employee [] newStaff=(Employee[])in.readObject();
			in.close();
			newStaff[0].raiseSalary(10);
			for (int i=0;i<newStaff.length;i++)
			System.out.println(newStaff[i].toString());
			}catch(Exception e){}
		
	
	}

}
class Employee implements Serializable
{
	//имя сотрудника
	private String name;
	//зарплата
	private double salary;
	private int year;
	public Employee()
	{
		
	}
	public Employee(String m, double s, int y)
	{
		name=m;
		salary=s;
		year=y;
	}
	

	public void raiseSalary(double byPercent)
	{
		double raise=salary*byPercent/100;
		salary+=raise;
	}
	public double getSalary()
	{
		return salary;
	}
	public String toString()
	{
		return getClass().getName()+"[name="+name+
				", salary="+salary
				+", year="+year+"]";
	}


}
class Manager extends Employee
{
	private double bonus;
	private Employee secretary;
	
	public Manager(String m, double s, int y)
	{
		super(m,s,y);
		bonus=0;
	}
	public void setSecretary(Employee s)
	{
		secretary=s;
	}
	public double getSalary()
	{
		return super.getSalary()+bonus;
	}
	public void setBonus(double b)
	{
		bonus=b;
	}
	public String toString()
	{
		return super.toString()+"[bonus="+bonus+", secretary"+secretary+"]";
	}
}

