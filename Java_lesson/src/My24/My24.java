package My24;

//поиск мин и мах

public class My24 
{
public static void main (String[] args)
	
	{
		System.out.println("It is program My24");
		double[] d=new double[25];
		for (int i=0;i<d.length;i++)
			d[i]=100*Math.random();
		for (int i=0;i<d.length;i++)
			System.out.println(i+" "+d[i]);
		//double min=d[0];
		//double max=d[0];
		//for (int i=0;i<d.length;i++)
		//{
		//	if(min>d[i]) min=d[i];
		//	if(max<d[i]) max=d[i];
		//}
		MyArray.Pair p=  MyArray.minmax(d);
		System.out.println("min"+p.getFirst());
		System.out.println("max"+p.getSecond());
	}
}
class MyArray
{
	public static class Pair
	{
		private double first;
		private double second;
		public Pair(double f, double s)
		{
			first=f;
			second=s;
		}
		public double getFirst()
		{
			return first;
		}
		public double getSecond()
		{
			return second;
		}
	}	
	
		public static Pair minmax(double[] d)
		{
		if (d.length==0) return new Pair(0,0);
		double min=d[0];
		double max=d[0];
		for (int i=0;i<d.length;i++)
			{
				if(min>d[i]) min=d[i];
				if(max<d[i]) max=d[i];
			}
		return new Pair(min,max);
		}
	
}
