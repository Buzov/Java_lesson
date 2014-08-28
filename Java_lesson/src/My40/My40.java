package My40;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;

//��������� ����


public class My40 
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
	JTextField text1;
	JTextField text2;
	String s1="",s2="",s3="";
	//��������� �������
	public MyPanel()
	{
		text1=new JTextField(20);
		add(text1);
		text2=new JTextField("Text",20);
		add(text2);
		text1.getDocument().addDocumentListener(new MyListener());
	}
	public void paintComponent(Graphics g)
	{
		
		//���������� ����� ����� �������� ������������� � ����
		super.paintComponent(g);
		//������ ����� � ����
		g.drawString(s1, 33, 77);
		g.drawString(s2, 33, 99);
		g.drawString(s3, 33, 122);
	}
	private class MyListener implements DocumentListener
	{
		//���������� ����-��
		public void insertUpdate (DocumentEvent e)
		{ 
			s3="("+text1.getText().trim()+")";
			text2.setText("\""+text1.getText()+"\"");
			s1=text1.getText(); repaint();
		}
		//�������� ����-�� � ����
		public void removeUpdate (DocumentEvent e)
		{
			s3="("+text1.getText().trim()+")";
			s2=text1.getText(); repaint();
		}
		//��������� ����-�� � ����
		public void changedUpdate (DocumentEvent e)
		{   
			//trim ����������� �������
			s3="("+text1.getText().trim()+")"; repaint();
		}
	}
}
		
		