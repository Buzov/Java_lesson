package Lesson_1;

public class My3 
{
	public static void main(String[] args)
	{
		//работа со строками
		System.out.println("It is my program My3");
		String s1=new String("12345");
		String s2="abcd", s3="";
		String s4=s1+s2;
		int i1=5;
		String s5=s2+i1;
		String s6=s2+5+2;
		String s7=s2+" "+(5+2);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		//копирование части строки
		String s8="My first string", s9=s8.substring(3,7);
		System.out.println(s8);
		System.out.println(s9);
		//определение длины строки
		int n=s8.length();
		char last=s8.charAt(n-1);
		System.out.println("length="+n);
		System.out.println("length="+last);
		s8=s8.substring(0,9)+"S"+s8.substring(10,n);
		System.out.println("s8="+s8);
		//проверка совпадения строк
		System.out.println(s1.equals("12345"));
		System.out.println(s1.equals("abcd"));
		System.out.println("12345".equals("12345"));
		//применение == сравнивает ссылки
		System.out.println(s1=="12345");
		
		
		
	}

}
