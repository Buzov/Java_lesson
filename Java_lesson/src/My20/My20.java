package My20;

import java.util.Arrays;


public class My20
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My20");
		Employee[] staff = new Employee[4];
		staff[0]=new Employee("Haug E.J.", 150000);
		staff[1]=new Employee("Adams R.A.", 60000);
		staff[2]=new Employee("Taylor A.A.", 35000);
		staff[3]=new Employee("Mitchel A.R.", 43000);
	
		for (int i=0; i<staff.length;i++)
		{
			Employee e = staff[i];
			System.out.println("name="+e.getName()+" salary="+e.getSalary());
			
		}
		System.out.println("--------------");
		Arrays.sort(staff);	
		
		for (int i=0; i<staff.length;i++)
		{
			Employee e = staff[i];
			System.out.println("name="+e.getName()+" salary="+e.getSalary());
			
		}
		System.out.println("--------------");
		Employee.setSort(1);
		Arrays.sort(staff);
		for (int i=0; i<staff.length;i++)
		{
			Employee e = staff[i];
			System.out.println("name="+e.getName()+" salary="+e.getSalary());
			
		}
		System.out.println("--------------");
		Employee.setSort(2);
		Arrays.sort(staff);
		for (int i=0; i<staff.length;i++)
		{
			Employee e = staff[i];
			System.out.println("name="+e.getName()+" salary="+e.getSalary());
			
		}
		System.out.println("--------------");
		Employee.setSort(3);
		Arrays.sort(staff);
		for (int i=0; i<staff.length;i++)
		{
			Employee e = staff[i];
			System.out.println("name="+e.getName()+" salary="+e.getSalary());
			
		}
		System.out.println("--------------");
		Employee.setSort(0);
		System.out.println("salary min"+My_class.max(staff));
		My_class.print_max(staff);
		Employee.setSort(1);
		System.out.println("salary max"+My_class.max(staff));
		My_class.print_max(staff);
		Employee.setSort(2);
		System.out.println("name min"+My_class.max(staff));
		My_class.print_max(staff);
		Employee.setSort(3);
		System.out.println("name max"+My_class.max(staff));
		My_class.print_max(staff);
	}
}

//-------------------------
interface My
{
	public int compareTo(Object other);
	public String getName();
}
class My_class
{
	public static int max(Object[] ar)
	{
		int i=0;
		for (int j=0; j<ar.length;j++)
		{
			My x1=(My) ar[1];
			My x2=(My) ar[j];
			if (x1.compareTo(x2)>0) i=j;
		}
		return i;
	}
	public static void print_max(Object[] ar)
	{
		int i=max(ar);
		My x1=(My) ar[1];
		System.out.println(i+" "+x1.getName());
	}
}
class Employee implements Comparable, My
{
	//имя сотрудника
	private String name;
	//зарплата
	private double salary;
	private static int sort=0;
	public Employee(String m, double s)
	{
		name=m;
		salary=s;
	}
	public static void setSort (int i)
	{
		sort = i;
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
	
	public int compareTo(Object other)
	{
		Employee e=(Employee)other;
		if (sort==2) return name.compareTo(e.name);
		if (sort==3) return -name.compareTo(e.name);
		if (sort==0)
		{	
			if (salary<e.salary) return -1;
			if (salary>e.salary) return 1;
		}
		if (salary<e.salary) return 1;
		if (salary>e.salary) return -1;
		return 0;
	}
	
}

