package My16;


public class My16 
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My16");
		Person[] people = new Person[5];
		people[0]=new Employee("Haug E.J.", 50000);
		Manager m=new Manager("Adams R.A.", 60000);
		m.setBonus(10000);
		people[1]=m;
		//staff[1]=new Employee("Adams R.A.", 60000);
		people[2]=new Employee("Taylor A.A.", 35000);
		people[3]=new Children("Mitchel A.R.", 12);
		people[4]=new Student("Morris J.A.", "computer science");
	
		for (int i=0; i<people.length;i++)
		{
			Person e = people[i];
			System.out.println("name="+e.getName()+", "+e.getDescription());
			
		}
	}
}

//-------------------------
abstract class Person
{
	//имя сотрудника
	private String name;
	public Person(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public abstract String getDescription();
	
}

class Employee extends Person
{
	
	
	//зарплата
	private double salary;
	public Employee(String n, double s)
	{
		super(n);
		salary=s;
	}
	public  String getDescription()
	{
		return "en employee with a salary of"+salary;
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
	public String getDescription()
	{
		return "manager with a salary of"+super.getSalary()+" and bonus"+bonus;
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

class Student extends Person
{
	private String major;
	public Student(String n, String m)
	{
		super(n);
		major=m;
		
	}
	public  String getDescription()
	{
		return "a student majoring in "+major;
	}
}

class Children extends Person
{
	private int age;
	public Children(String n, int i)
	{
		super(n);
		age=i;
		
	}
	public  String getDescription()
	{
		return "a child. His age is "+age+" years old";
	}
}