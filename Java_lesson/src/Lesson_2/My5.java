package Lesson_2;

import javax.swing.*;

public class My5 
{
	public static void main(String[] args)
	{
		
		System.out.println("It is program My5");
		int ii;
		do
	    {
		
		String ss=JOptionPane.showInputDialog("Your salary?");
		System.out.println("Your salary"+ss);
		ii=Integer.parseInt(ss);
	    double xx=0;
	    if(ii>5000)
	    {
	    	xx=(ii-5000)*0.3+(5000-1000)*0.14;
	    	System.out.println("Your will pay"+xx);
	     }  else  if (ii>1000) 
	    
	    	{xx=(ii-1000)*0.14;
	    System.out.println("Your will pay"+xx);
	    	} else
	    		System.out.println("Your must pay nothing !");		
	    } while (ii>0);
	    System.exit(0);
	}
	
}