package My33;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


import javax.swing.*;

//операции над окном 

public class My33 
{
	public static void main(String[] args)
	{
		System.out.println("It is program My");
		MyFrame frame=new MyFrame();
		//условие закрытия окна
		/*frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		frame.show();
	
	}

}

class MyFrame extends JFrame /*implements WindowListener*/
{
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		addWindowListener(new WindowAdapter()
		{
			//показывает, что происходит с окном
			public void windowOpened(WindowEvent e)
			{System.out.println("Opend");}
			public void windowClosing(WindowEvent e)
			{System.out.println("Closing");System.exit(0);}
			public void windowClosed(WindowEvent e)
			{System.out.println("Closed");}
			public void windowIconified(WindowEvent e)
			{System.out.println("Iconified");}
			public void windowDeiconified(WindowEvent e)
			{System.out.println("Deiconified");}
			public void windowActivated(WindowEvent e)
			{System.out.println("Activated");}
			public void windowDeactivated(WindowEvent e)
			{System.out.println("Deactivated");}	
		});
		
		
	}
	
	
	
}	
