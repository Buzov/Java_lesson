package My21;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

//import javax.management.timer.Timer;
import javax.swing.*;
import javax.swing.Timer;

public  class My21 
{
	public static void main(String[] args)
	{
		System.out.println("It is program My21");
		ActionListener listener=new TimePrinter();
		Timer t=new Timer(5000, listener);
		t.start();
		JOptionPane.showMessageDialog(null,"Exit ?");
		System.exit(0);
	}

}
class TimePrinter implements ActionListener
{
	static int i=0;
	public void actionPerformed(ActionEvent event)
	{
		Date now=new Date();
		System.out.println("Time is "+now);
		i++;
		if (i==4) System.exit(0);
	}
}