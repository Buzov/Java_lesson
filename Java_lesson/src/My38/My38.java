package My38;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

//���������� �������� �� �������

public class My38 
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
		
		//��������� ���������� �����
		Container pane=getContentPane();
		MyPanel panel=new MyPanel();
		pane.add(panel);
		//������������ ������
		MyPanel panel1=new MyPanel();
		pane.add(panel1,BorderLayout.NORTH);
		//������������ �����
		MyPanel pane2=new MyPanel();
		pane.add(pane2,BorderLayout.SOUTH);
		//������������ �����
		MyPanel pane3=new MyPanel();
		pane.add(pane3,BorderLayout.EAST);
		//������������ ������
		MyPanel pane4=new MyPanel();
		pane.add(pane4,BorderLayout.WEST);
		
	}
	
}	

class MyPanel extends JPanel
{
	public MyPanel()
	{
		//����� ������������ ������
		setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		//��� ��������� ������
		for (int i=0;i<3;i++)
			{
		JButton b=new JButton (""+i);
		add(b);
			}
	}
}
		
		