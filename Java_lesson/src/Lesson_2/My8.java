package Lesson_2;


import java.math.*;
//работа большими числами определение числа ≈

public class My8
{
	public static void main(String[] args)
	{
		System.out.println("It is program My8");
	    BigInteger sum=BigInteger.valueOf(0), sumi=BigInteger.valueOf(1);
	    for (int i1=1;i1<=64;i1++)
	    {
	    	sum=sum.add(sumi);
	    	sumi=sumi.multiply(BigInteger.valueOf(2));
	    	
	    }
	    System.out.println("sum="+sum);
	    System.out.println("E="+Math.E);
	    BigDecimal e=BigDecimal.valueOf(0,35), e1=BigDecimal.valueOf(0,35);
	    e1=e1.add(BigDecimal.valueOf(1));
	    int i1=0;
	    while (e1.compareTo(BigDecimal.valueOf(1,35))>=0)
	    {
	    	i1++;
	    	e=e.add(e1);
	    	e1=e1.divide(BigDecimal.valueOf(i1),BigDecimal.ROUND_HALF_UP);
	    	System.out.println(e1+" e="+e);
	    }
	}
}