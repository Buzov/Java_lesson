package Lesson_2;

import java.math.*;



//работа с многомерными масивами

public class My10
{
	public static void main(String[] args)
	{
		System.out.println("It is program My10");
		int [][] a1=
			{
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34}
			};
		for (int i1=0;i1<a1.length;i1++)
		{
			for (int i2=0;i2<a1[i1].length;i2++)
				System.out.print(a1[i1][i2]+"  ");
			System.out.println();
		};
		System.out.println("------------");
		int [][] a2=new int [5][5];
			for (int i1=0; i1<a2.length; i1++)
				for (int i2=0;i2<a2[i1].length;i2++)
					a2[i1][i2]=(int)(Math.random()*1000);
	    
			for (int i1=0;i1<a2.length;i1++)
			{
				for (int i2=0;i2<a2[i1].length;i2++)
					System.out.print(a2[i1][i2]+"  ");
				System.out.println();
			};
			//многомерные неровные масивы
			System.out.println("------------");
			int [][] a3=new int [5][];
				for (int i1=0; i1<a3.length; i1++)
				{	a3[i1]=new int[(int)(Math.random()*8)];
					for (int i2=0;i2<a3[i1].length;i2++)
						a3[i1][i2]=(int)(Math.random()*1000);
				};
				for (int i1=0;i1<a3.length;i1++)
				{
					for (int i2=0;i2<a3[i1].length;i2++)
						System.out.print(a3[i1][i2]+"  ");
					System.out.println(" n="+a3[i1].length);
				};
			//
				System.out.println("------------");
			char[][] a4=
				{{'q','w','e','r','t','y','u','i','o','p'},
					{'a','s','d','f','g','h','j','k','l'},
					{'z','x','c','v','b','n','m'}
					};
			for (int i1=0;i1<a4.length;i1++)
			{
				for (int i2=0;i2<a4[i1].length;i2++)
					System.out.print(a4[i1][i2]+"  ");
				System.out.println(" n="+a4[i1].length);
			};
	}
}