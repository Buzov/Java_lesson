package My37;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//многоадресная передача событий
//создание дочернего окна

public class My37
{
	public static void main(String[] args)
	{
		System.out.println("It is program My");
		MyFrame frame=new MyFrame();
		//условие закрытия окна
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	
	}

}

class MyFrame extends JFrame
{
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		MyPanel panel=new MyPanel();
		//получение клиентской части
		Container pane=getContentPane();
		pane.add(panel);
		
	}
	
}	

class MyPanel extends JPanel
{
	public MyPanel()
	{
		//создание кнопок
		JButton newButton=new JButton("New");
		add(newButton);
		final JButton closeAllButton=new JButton("Close all");
		add(closeAllButton);
		//безымянный класс
		ActionListener newListener=new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				BlankFrame frame=new BlankFrame(closeAllButton);
				frame.show();
			}
		};
		newButton.addActionListener(newListener);
	}
}
//
class BlankFrame extends JFrame
{
	private ActionListener closeListener;
	
	private static int counter=0;
	
	public BlankFrame(final JButton closeAllButton)
	{
		counter++;
		setTitle("Frame "+counter);
		setSize(200,150);
		setLocation(200+counter*40,200+counter*30);
		closeListener=new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				
				closeAllButton.removeActionListener(closeListener);
				dispose();
			}
		};
		closeAllButton.addActionListener(closeListener);
	}
	
}
		
		