package My26;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

//���� � �������

public class My26 
{
	public static void main(String[] args)
	{
		System.out.println("It is program My");
		MyFrame frame=new MyFrame();
		//������� �������� ����
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
		//��������� ���������� �����
		Container pane=getContentPane();
		pane.add(panel);
		
	}
	
}	

class MyPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		//���������� ����� ����� �������� ������������� � ����
		super.paintComponent(g);
		//������ ����� � ����
		g.drawString("It is text", 55, 55);
	}
}
		
		