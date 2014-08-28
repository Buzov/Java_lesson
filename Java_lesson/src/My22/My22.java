package My22;



public class My22 
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My22");
		Employee  original = new Employee("Taylor E.A", 50000, "Fleming J.L.");
		Employee copy = (Employee) original.clone();
		copy.raiseSalary(10);
		copy.setFriend("Murat T.G.");
		System.out.println("original="+original.toString());
		System.out.println("copy="+copy.toString());
	
	}
}

//-------------------------

class Employee implements Cloneable
{
	//имя сотрудника
	private String name;
	//зарплата
	private double salary;
	private Friend name1;
	public Employee(String m, double s, String n1)
	{
		name=m;
		salary=s;
		name1=new Friend(n1);
	}
	public Object clone()
	{
		try{
		Employee cloned=(Employee) super.clone();
		cloned.name1=(Friend) name1.clone();
		return cloned;
		}
		catch (CloneNotSupportedException e){return null;}
	}
	public void setFriend(String n1)
	{
		name1.setName(n1);
	}
	public void raiseSalary(double byPercent)
	{
		double raise = salary*byPercent/100;
		salary+=raise;
	}
	
	public String toString()
	{
		return "Employee [name=" + name
				+ ", salsry=" + salary
				+ "]"+name1.toString();
	}

	
}

class Friend implements Cloneable
{
	private String name;
	public Friend (String n)
	{
		name=n;
	}
	public void setName(String n)
	{
		name=n;
	}
	public Object clone()
	{
		try{
		Friend cloned=(Friend) super.clone();
		
		return cloned;
		}
		catch (CloneNotSupportedException e){return null;}
	}
	public String toString()
	{
		return "Friend [name=" + name
				+ "]";
	}
}

