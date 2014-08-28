package Lesson_5;

public class My15 
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My15");
		Employee[] staff = new Employee[4];
		staff[0]=new Employee("Haug E.J.", 50000);
		Manager m=new Manager("Adams R.A.", 60000);
		m.setBonus(10000);
		staff[1]=m;
		//staff[1]=new Employee("Adams R.A.", 60000);
		staff[2]=new Employee("Taylor A.A.", 35000);
		staff[3]=new Employee("Mitchel A.R.", 43000);
	
		for (int i=0; i<staff.length;i++)
		{
			Employee e = staff[i];
			System.out.println("name="+e.getName()+" salary="+e.getSalary());
			
		}
	}
}

//-------------------------

class Employee
{
	//имя сотрудника
	private String name;
	//зарплата
	private double salary;
	public Employee(String m, double s)
	{
		name=m;
		salary=s;
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void raiseSalary(double byPercent)
	{
		salary*=1+byPercent/100;
	}
	
	public int equals(Employee other)
	{
		if (salary>other.salary)
		{
			return 1;
		}
		else
		{
			if(salary==other.salary)
			{return 0;}
			else
			{return -1;}
		}
	}
	
}

class Manager extends Employee
{
	private double bonus;
	public Manager(String m, double s)
	{
		super(m,s); bonus=0;
	}
	public void setBonus(double b)
	{
		bonus=b;
	}
	public double getSalary()
	{
		double s=super.getSalary();
		return s+bonus;
	}
	
}
