package My28;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


import javax.swing.*;

//Graphics2D

public class My28 
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
		setSize(500,500);
		MyPanel panel=new MyPanel();
		//получение клиентской части
		Container pane=getContentPane();
		pane.add(panel);
		
	}
	
}	

class MyPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		double x1=11, y1=11, dx=44, dy=66;
		//прямоугольник
		Rectangle2D rect1=new Rectangle2D.Double(x1,y1,dx,dy);
		g2.draw(rect1);
		//закрашенный прямоугольник
		x1+=dx+15;
		Rectangle2D rect2=new Rectangle2D.Double(x1,y1,dx,dy);
		g2.setPaint(Color.red);
		g2.fill(rect2);
		
		Rectangle2D rect33=new Rectangle2D.Double(x1,y1,dx,dy);
		g2.setPaint(Color.black);
		g2.draw(rect33);
		
		double rx=22, ry=33;
		x1+=dx+15;
		//задание толщины линии
		g2.setStroke(new BasicStroke(6));
		RoundRectangle2D rect3=new RoundRectangle2D.Double(x1,y1,dx,dy,rx,ry);
		g2.setPaint(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		g2.draw(rect3);
		x1+=dx+15;
		//Скпугленный прямоугольник
		RoundRectangle2D rect4=new RoundRectangle2D.Double(x1,y1,dx,dy,rx,ry);
		g2.setPaint(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		g2.fill(rect4);
		
		x1+=dx+15;
		//сдвиг
		g2.translate(50, 80);
		Ellipse2D rect5=new Ellipse2D.Double();
		rect5.setFrame(x1,y1,dx,dy);
		g2.setPaint(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		g2.fill(rect5);
		g2.setPaint(g2.getColor().darker());
		//поворот
		g2.rotate(0.1);
		g2.draw(rect5);
		
		//
		x1+=dx+15;
		Line2D line1=new Line2D.Double(x1,y1,x1+dx,y1+dy);
		g2.setPaint(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		g2.draw(line1);
		
		Line2D line2=new Line2D.Double(x1+dx,y1,x1,y1+dy);
		g2.setPaint(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		g2.draw(line2);
		//масштабирование
		g2.scale(2, 2.2);
		x1=11;y1=100;
		Arc2D arc1=new Arc2D.Double();
		arc1.setArc(x1,y1,dx,dy,45,340,Arc2D.PIE);
		g2.setPaint(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		g2.fill(arc1);
		g2.setPaint(g2.getColor().darker());
		g2.draw(arc1);
		//
		x1+=dx+15;
		g2.rotate(-1,x1,y1);
		QuadCurve2D line3=new QuadCurve2D.Double(x1,y1,x1+dx,y1,x1+dx,y1+dy);
		g2.setPaint(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		g2.draw(line3);
		
		//
		x1+=dx+15;
		CubicCurve2D line4=new CubicCurve2D.Double(x1,y1,x1+dx,y1,x1,y1+dy*2,x1+dx,y1+dy);
		g2.setPaint(new Color((int) (Math.random()*255),
				(int) (Math.random()*255),
				(int) (Math.random()*255)));
		g2.draw(line4);
		
	} 
}
		
		