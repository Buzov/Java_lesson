package My38;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

//–азмещение обьектов на панел€х

public class My38 
{
	public static void main(String[] args)
	{
		System.out.println("It is program My");
		MyFrame frame=new MyFrame();
		//условие закрыти€ окна
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
		
		//получение клиентской части
		Container pane=getContentPane();
		MyPanel panel=new MyPanel();
		pane.add(panel);
		//расположение вверху
		MyPanel panel1=new MyPanel();
		pane.add(panel1,BorderLayout.NORTH);
		//расположение внизу
		MyPanel pane2=new MyPanel();
		pane.add(pane2,BorderLayout.SOUTH);
		//расположение слева
		MyPanel pane3=new MyPanel();
		pane.add(pane3,BorderLayout.EAST);
		//расположение справа
		MyPanel pane4=new MyPanel();
		pane.add(pane4,BorderLayout.WEST);
		
	}
	
}	

class MyPanel extends JPanel
{
	public MyPanel()
	{
		//выбор выравнивани€ кнопок
		setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		//как размещаем кнопки
		for (int i=0;i<3;i++)
			{
		JButton b=new JButton (""+i);
		add(b);
			}
	}
}
		
		