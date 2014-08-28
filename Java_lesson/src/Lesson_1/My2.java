package Lesson_1;

public class My2 
{
	public static void main(String[] args)
	{
		int a=1+3;
		int b=a*3;
		int c=b/5;
		int d=b-a, e=-d;
		int f=b%5;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		System.out.println("e="+e);
		System.out.println("f="+f);
		//сокращенный оператор
		a+=4;
		b*=3;
		c+=a+b;
		c%=5;
		d-=3;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		a++;
		b--;
		int k1=5, k2=5;
		int s1=2*++k1;
		int s2=2*k2++;
		System.out.println("k1="+k1);
		System.out.println("k21="+k2);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		double x=2;
		double y=Math.sqrt(x);
		System.out.println("y="+y);
		double xx=Math.pow(Math.PI,Math.E);
		System.out.println("xx="+xx);
		int n1=123456789;
		float f1=n1;
		System.out.println("n1="+n1);
		System.out.println("f1="+f1);
		int n2=(int)f1;
		System.out.println("n2="+n2);
		double z1=2.7;
		int ii1=(int) z1;
		int ii2=(int) Math.round(z1);
		System.out.println("z1="+z1);
		System.out.println("ii1="+ii1);
		System.out.println("ii2="+ii2);
		
	}
}
