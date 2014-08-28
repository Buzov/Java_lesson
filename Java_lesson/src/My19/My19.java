package My19;

import java.util.*;

public class My19 
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My19");
		
		ArrayList people = new ArrayList();
		people.add(new Employee("Haug E.J.", 50000));
		//people[0]=new Employee("Haug E.J.", 50000);
		Manager m=new Manager("Adams R.A.", 60000);
		m.setBonus(10000);
		people.add(m);
		//people[1]=m;
		//staff[1]=new Employee("Adams R.A.", 60000);
		people.add(new Employee("Taylor A.A.", 35000));
		
		people.add(new Children("Mitchel A.R.", 12));
		
		
		people.add(new Student("Morris J.A.", "computer science"));
		
		for (int i=0; i<people.size();i++)
		{
			Person e = (Person)people.get(i);
			System.out.println(i+"name="+e.getName()+", "+e.getDescription());
			
		}
		people.set(3,m);
		people.add(new String("It is string"));
		people.add(new Children("Mitchel A.R.", 12));
		for (int i=0; i<people.size();i++)
		{
			Object obj=people.get(i);
			if(obj instanceof Person)
			{Person e = (Person)people.get(i);
			System.out.println(i+"name="+e.getName()+", "+e.getDescription());
			if (obj instanceof String)
			{
				String ss=(String)people.get(i);
				System.out.println(i+" "+ss);
			}
			}
		}
		people.add(2, new Employee("Add", 100000));
		people.remove(5);
		people.add(new Double (2.5));
		for (int i=0; i<people.size();i++)
		{
			Object obj=people.get(i);
			if(obj instanceof Person)
			{Person e = (Person)people.get(i);
			System.out.println(i+"name="+e.getName()+", "+e.getDescription());
			if (obj instanceof String)
			{String s=(String)people.get(i);
			 System.out.println(i+" "+s);}
			if (obj instanceof Double)
			{Double s=(Double)people.get(i);
			 System.out.println(i+" "+s);}
			
			}
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
	
	public boolean equals(Object other)
	{
		if (this==other) return true;
		if (other==null) return false;
		if (getClass()!= other.getClass()) return false;
		Person e=(Person) other;
		return name.equals(e.name);
	}
	public String toString()
	{
		return getClass().getName()+"[name="+name+"]";
	}

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
	
	public boolean equals(Object other)
	{
		if(!super.equals(other)) return false;
		Employee e=(Employee) other;
		return salary==e.salary;
	}
	public String toString()
	{
		return super.toString()+"[salary"+salary+"]";
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
	public boolean equals(Object other)
	{
		if(!super.equals(other)) return false;
		Manager m=(Manager) other;
		return bonus==m.bonus;
	}
	public String toString()
	{
		return super.toString()+"[bonus"+bonus+"]";
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
	public boolean equals(Object other)
	{
		if(!super.equals(other)) return false;
		Student e=(Student) other;
		return major.equals(e.major);
	}
	public String toString()
	{
		return super.toString()+"[major"+major+"]";
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
	public boolean equals(Object other)
	{
		if(!super.equals(other)) return false;
		Children e=(Children) other;
		return age==e.age;
	}
	public String toString()
	{
		return super.toString()+"[age"+age+"]";
	}
}