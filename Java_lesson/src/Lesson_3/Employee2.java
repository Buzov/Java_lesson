package Lesson_3;

class Employee2
{
	//имя сотрудника
	private String name;
	//зарплата
	private double salary;
	private int id;
	private static int nextId;//nextId=1;
	{
		id=nextId;
		nextId++;
	}
	//статический метод
	static 
	{
		nextId=10;
		
	}
	public static void setId(int i)
	{
		nextId=i;
	}
	public Employee2(String m, double s)
	{
		name=m;
		salary=s;
	}
	public Employee2(String n)
	{
		name=n;
		salary=10000;
	}
	public Employee2(double s)
	{
		this ("Employee #"+nextId,s);
	}
	public Employee2()
	{
		this ("Employee #"+nextId,10000);
	}
	
	public int getId()
	{
		return id;
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
	public boolean setSalary(double newSalary)
	{
		if (newSalary<10000) {return false;}
			else
		{salary=newSalary;
		return true;}
		
	}
	public int equals(Employee2 other)
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
	public int equals(double d)
	{
		if (salary>d)
		{
			return 1;
		}
		else
		{
			if(salary==d)
			{return 0;}
			else
			{return -1;}
		}
	}
}
