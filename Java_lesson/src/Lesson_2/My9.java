package Lesson_2;

import java.util.*;



//работа с масивами

public class My9
{
	public static void main(String[] args)
	{
		System.out.println("It is program My9");
		int [] a1=new int[10];
		for (int i1=0;i1<a1.length;i1++)
		a1[i1]=i1*i1;
		for (int i1=0;i1<a1.length;i1++)
			System.out.println(i1+"  "+a1[i1]);
		int[] a2={1,2,3,4,4,3,2,1};
		for (int i1=0;i1<a2.length;i1++)
			System.out.println(i1+"  "+a2[i1]);
		int[] a3=a2;
		a2[2]=100;
		a3[5]=50;
		for (int i1=0;i1<a2.length;i1++)
			System.out.println(i1+"  "+a2[i1]+"  "+a3[i1]);
		int[] a4={11,12,13,14,15,16,17,18,19,20};
		System.arraycopy(a2, 2, a4, 3, 3); //копируем элементы а2 со второго члена и вставляем в а4 начиная с третьего, вставляем три символа
		for (int i1=0;i1<a2.length;i1++)
		System.out.println(i1+"  "+a2[i1]+"  "+a4[i1]);
		int [] a5=new int[a2.length];
		System.arraycopy(a2, 0, a5, 0, a2.length);
		//сортировка
		Arrays.sort(a5);
		System.out.println("---------");
		for (int i1=0;i1<a2.length;i1++)
			System.out.println(i1+"  "+a2[i1]+"  "+a5[i1]);
		//поиск номера элемента с определленым значением
		System.out.println("---------");
		for (int i1=0;i1<10;i1++)
			System.out.println(i1+"  "+Arrays.binarySearch(a2,i1));
		
		
		
	}
}
