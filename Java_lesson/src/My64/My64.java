package My64;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class My64
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My20");
		Employee[] staff = new Employee[4];
		staff[0]=new Employee("Haug E.J.", 150000, 2000);
		staff[1]=new Employee("Adams R.A.", 60000, 2001);
		staff[2]=new Employee("Taylor A.A.", 35000, 1998);
		staff[3]=new Employee("Mitchel A.R.", 43000, 1996);
	
		for (int i=0; i<staff.length;i++)
		{
			System.out.println(staff[i].toString());
			System.out.println("----------------");
			try
			{
				PrintWriter out=new PrintWriter(new FileWriter("employee.dat"));
				writeData(staff,out);
				out.close();
				BufferedReader in=new BufferedReader(new FileReader("employee.dat"));
				Employee[] newStaff=readData(in);
				in.close();
				for (int ii=0;ii<newStaff.length;ii++)
					System.out.println(newStaff[ii].toString());
			}catch(IOException exception){}
		}
	}
	static void writeData(Employee[] e, PrintWriter out)
			throws IOException
	{
		out.println(e.length);
		for (int i=0;i<e.length;i++)
			e[i].writeData(out);
	}
	static Employee[] readData(BufferedReader in)
			throws IOException
	{
		int n=Integer.parseInt(in.readLine());
		Employee[] e=new Employee[n];
		for(int i=0;i<n;i++)
		{
			e[i]=new Employee();
			e[i].readDate(in);
		}
		return e;
	}
}

class Employee 
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
		salary*=1+byPercent/100;
	}
	public String toString()
	{
		return "Employee[name="+name+
				", salary="+salary
				+", year="+year+"]";
	}

	public void writeData(PrintWriter out)
			throws IOException
		{
		out.println(name+"|"+salary+"|"+year);
		}
	public void readDate(BufferedReader in)
			throws IOException
	{
		String s=in.readLine();
		StringTokenizer t=new StringTokenizer(s,"|");
		name=t.nextToken();
		salary=Double.parseDouble(t.nextToken());
		year=Integer.parseInt(t.nextToken());
	}
}

