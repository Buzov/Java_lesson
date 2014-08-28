package Lesson_4;
/**
 * It is <strong>class</strong> <em>Employee</em>
 * @author RT
 *
 */
public class Employee
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
	public Employee(String m, double s)
	{
		name=m;
		salary=s;
	}
	public Employee(String n)
	{
		name=n;
		salary=10000;
	}
	public Employee(double s)
	{
		this ("Employee #"+nextId,s);
	}
	public Employee()
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
