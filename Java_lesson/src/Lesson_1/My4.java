
package Lesson_1;

import java.text.*;

import javax.swing.*;

public class My4 
{
	public static void main(String[] args)
	{
		
		System.out.println("It is my program My4");
		String name=JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello, "+name);
		
		String i1=JOptionPane.showInputDialog("Number one");
		String i2=JOptionPane.showInputDialog("Number two");
		int ni1=Integer.parseInt(i1);
		int ni2=Integer.parseInt(i2);
		System.out.println(i1+"x"+i2+"="+ni1*ni2);
		System.out.println(i1+"/"+i2+"="+(double)ni1/ni2);
		
		NumberFormat myFormat=NumberFormat.getNumberInstance();
		//установка максимального количества цифр после запятой
		myFormat.setMaximumFractionDigits(1);
		
		System.out.println(i1+"x"+i2+"="+myFormat.format(ni1*ni2));
		System.out.println(i1+"/"+i2+"="+myFormat.format((double)ni1/ni2));
	    
		System.exit(0);
		
		
	}
	
}