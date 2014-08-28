package My65;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.StringTokenizer;


public class My65
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
				DataOutputStream out=new DataOutputStream(new FileOutputStream("employee.dat"));
				writeData(staff,out);
				out.close();
				RandomAccessFile in=new RandomAccessFile ("employee.dat","r");
				Employee[] newStaff=readData(in);
				in.close();
				for (int ii=0;ii<newStaff.length;ii++)
					System.out.println(newStaff[ii].toString());
			}catch(IOException exception){}
		}
	}
	static void writeData(Employee[] e, DataOutputStream out)
			throws IOException
	{
		
		for (int i=0;i<e.length;i++)
			e[i].writeData(out);
	}
	static Employee[] readData(RandomAccessFile in)
			throws IOException
	{
		int n=(int)(in.length()/Employee.RECORD_SIZE);
		
		Employee[] e=new Employee[n];
		for(int i=n-1;i>=0;i--)
		{
			e[i]=new Employee();
			in.seek(i*Employee.RECORD_SIZE);
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
	public static final int NAME_SIZE=40;
	public static final int RECORD_SIZE=2*NAME_SIZE+8+4;
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

	public void writeData(DataOutput out)
			throws IOException
		{
		  for(int i=0;i<NAME_SIZE;i++)
		  {
			  char ch=0;
			  if (i<name.length())ch=name.charAt(i);
			  out.writeChar(ch);
		  }
		  out.writeDouble(salary);
		  out.writeInt(year);
		}
	public void readDate(DataInput in)
			throws IOException
	{
		StringBuffer b=new StringBuffer(NAME_SIZE);
		int i=0;
		boolean more=true;
		while (more && i<NAME_SIZE)
		{
			char ch=in.readChar();
			i++;
			if (ch==0) more = false;
			else b.append(ch);
		}
		name=b.toString();
		in.skipBytes(2*(NAME_SIZE-i));
		salary=in.readDouble();
		year=in.readInt();
	}
}

