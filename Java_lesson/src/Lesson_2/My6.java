package Lesson_2;


public class My6 
{
	public static void main(String[] args)
	{
		System.out.println("It is program My6");
		int i1, sum, max;
		
		i1=0; sum=0; max=100;
		
		while (sum+i1<max)
		{
			i1++;
			sum+=i1;
		}
		
	    System.out.println("sum 0.."+i1+"="+sum);
	    do
	    {
	    	i1++;
	    	sum+=i1;
	    } while (sum+i1<max);
	    System.out.println("sum 0.."+i1+"="+sum);
	    sum=0; max=100;
	    for (i1=0;sum+i1<max;i1++)
	    	sum+=i1;
	    System.out.println("sum 0.."+i1+"="+sum);
	    for (int i2=0;i2<=10;i2++)sum+=i2;
	    System.out.println("sum 0..10"+"="+sum);
	    sum=0;
	    for (int i2=20;i2>=10;i2--)sum+=i2;
	    System.out.println("sum 20..10"+"="+sum);
	    int sum1=0;
	    for (double d1=0; d1<10;d1+=0.1)sum1+=1;
	    System.out.println(sum1);
	}
	
}	