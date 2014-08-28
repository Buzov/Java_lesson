package My17;

public class My17 
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My17");
		Person[] people = new Person[9];
		people[0]=new Employee("Haug E.J.", 50000);
		Manager m=new Manager("Adams R.A.", 60000);
		m.setBonus(10000);
		people[1]=m;
		//staff[1]=new Employee("Adams R.A.", 60000);
		people[2]=new Employee("Taylor A.A.", 35000);
		people[3]=people[1];
		people[4]=new Children("Mitchel A.R.", 12);
		people[5]=people[1];
		people[6]=people[4];
		people[7]=new Student("Morris J.A.", "computer science");
		people[8]=people[7];
		for (int i=0; i<people.length;i++)
		{
			Person e = people[i];
			System.out.println(i+"name="+e.getName()+", "+e.getDescription());
			
		}
		for (int i=0; i<people.length;i++)
		{
			System.out.print(i);
			for (int j=0; j<people.length;j++)
			{
				if (people[i].equals(people[j]))
					System.out.print(" = "+j);
			}
			System.out.println();
			
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
}