package Lesson_1;//my comment

public class MyFirst 
{
	public static void main (String[] args)
	{
		
		System.out.println("It is my my first programm");//no comment
		//comment for my text
		/*comment for my text
		 comment for my text*/
		
		//1 ���� ��������
		byte a;
		//2 ����� ��������
		short b;
		//4 ����� ��������
		int c;
		//8 ����� ��������
		long d = 3000000000L;
		
		
		//������ 8 � 8-�� �������. �������� � ����
		
		int e = 014;
		
		//������ � 16-�� �������. �������� � 0�
		
		int f = 0x6a8B;
		System.out.println("0x6a8B = "+f);
		System.out.println("014 = "+e);
		System.out.println("3000000000L = "+d);
		
		//4 ����� ��������
		float f1=14.3f, f3=0.78f,f4=6.1e15f;
		
		//8 ���� ��������
		double f2=3141E-3, f5=3e10;
		
		System.out.println(f1+"  "+f3+"  "+f4);
		System.out.println(f2+"  "+f5);
		
		char c1='G', c2=66, c3=0x66,c4='\u0059';
				
		System.out.println("\""+c1+c2+'\n'+c3+c4+'\b'+'o');	
		
		//'\b' ������� �� ���� �������
		//'\t' ������ ���������
		//'\n' ������� �� ���� ������
		//'\r' ������� �������
		//'\\' ���� ���� �����
		//'\"' ���� ������� "
		
		//����� ������������ �� ��������� ������ ���� ��������� ��������� 
		/*static*/ final boolean bb=true,bb1=false;
		
		System.out.println(""+bb+bb1);	
		
	}
}
