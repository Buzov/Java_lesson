package My27;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

//������ ������ ��������������

public class My27 
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
		setSize(500,500);
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
		super.paintComponent(g);
		//��������� ����� ����
		setBackground(Color.YELLOW);
		int x1=22, y1=22, dx=44, dy=66;
		//������ �����
		g.drawLine(x1,y1,x1+dx,y1+dy);
		//���������� ����� �� �������
		g.setColor(Color.green);
		//������ �������������
		g.drawRect(x1,y1,dx,dy);
		//������ ���� �� ��������� ���� �������� ����
		g.setColor(SystemColor.activeCaption);
		//������������� � �������� ������
		int rx=35, ry=35;x1=77;
		g.drawRoundRect(x1,y1,dx,dy,rx,ry);
		//������ ������������ �����4� ����� ����� �����
		setForeground(Color.red);
		//������� �����
		g.setColor(Color.gray);
		//������������� ����� ��������
		x1+=dx+15;
		g.clearRect(x1,y1,dx,dy);
		//������������� ������� ������ �� ���������
		x1+=dx+15;
		
		g.fillRect(x1,y1,dx,dy);
		//����� ������ �����
		g.setColor(Color.gray.brighter());
		//������������� ������� ������ �� ��������� �� ������������ ������
		x1+=dx+15;
		g.fillRoundRect(x1,y1,dx,dy,rx,ry);
		//������������� ��� ����������
		x1+=dx+15;
		g.draw3DRect(x1,y1,dx,dy,true);
		//
		g.setColor(Color.blue);
		//����������� ������������� ��� ����������
		x1+=dx+15;
		g.fill3DRect(x1,y1,dx,dy,true);
		g.setColor(Color.blue.darker());
		g.setColor(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		//������ �������� � ��������������
		x1=22; y1=100;
		g.drawOval(x1,y1,dx,dy);
		g.setColor(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		//����������� ������
		x1+=dx+15;
		g.fillOval(x1,y1,dx,dy);
		g.setColor(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		//������ ����� 30 ��������� ���� 300 �������� ����
		x1+=dx+15;
		g.drawArc(x1,y1,dx,dy,30,300);
		g.setColor(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		x1+=dx+15;
		g.fillArc(x1,y1,dx,dy,0,270);
		//�������������
		int[] mx=new int[8];
		int[] my=new int[8];
		x1=22; y1=180;
		for (int i=0; i<mx.length;i++)
		{
			mx[i]=(int) (Math.random()*dx)+x1;
			my[i]=(int) (Math.random()*dy)+y1;
		}
		g.drawPolygon(mx,my,8);
		//
		x1+=dx+15;
		Polygon p=new Polygon();
		for (int i=0; i<6;i++)
		{
			p.addPoint((int) (Math.random()*dx)+x1,
			(int) (Math.random()*dy)+y1);
		}
		g.fillPolygon(p);
		//������� �����
		x1+=dx+15;
		for (int i=0; i<mx.length;i++)
		{
			mx[i]=(int) (Math.random()*dx)+x1;
			my[i]=(int) (Math.random()*dy)+y1;
		}
		g.drawPolyline(mx,my,8);
		
	} 
}
		
		