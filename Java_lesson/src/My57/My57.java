package My57;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;

import javax.swing.*;



public class My57
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

	private ArrayList circle;
	private Ellipse2D current;
	public MyPanel()
	{
		circle=new ArrayList();
		current=null;
		addMouseListener(new MyMouse());
		addMouseMotionListener(new MyMove());
	}
	public void paintComponent(Graphics g)
	{
				super.paintComponent(g);
		g.drawString("It is text",55,55);
		Graphics2D g2=(Graphics2D) g;
		for (int i=0; i<circle.size();i++)
		{
			g2.setColor(new Color((i*100+20)%255,
					(i*70+40)%255,
					(i*120+111)%255));
			g2.fill((Ellipse2D) circle.get(i));
		}
	}
	public void add (Point2D p)
	{
		current=new Ellipse2D.Double(p.getX()-10, p.getY()-10,150,150);
		circle.add(current);
		repaint();
	}
	public Ellipse2D find(Point2D p)
	{
		for(int i=0;i<circle.size();i++)
		{
			Ellipse2D e = (Ellipse2D) circle.get(i);
			if (e.contains(p)) return e;
		}
		return null;
	}
	public void remove(Ellipse2D e)
	{
		if (e==null) return;
		if (e==current) current=null;
		circle.remove(e);
		repaint();
	}
	private class MyMouse extends MouseAdapter
	{
		public void mousePressed(MouseEvent event)
		{
			current=find(event.getPoint());
			if (current==null)
			add(event.getPoint());
		}
		public void mouseClicked(MouseEvent event)
		{
			if(event.getClickCount()>=2)
			{
			current=find(event.getPoint());
			if (current!=null) remove(current);
			}
		}
	}
	//движение обьектов за курсором 
	private class MyMove implements MouseMotionListener
	{
		//при наведении на окружность курсор меняет вид
		public void mouseMoved(MouseEvent event)
		{
			if (find(event.getPoint())==null)
				setCursor(Cursor.getDefaultCursor());
				else
					setCursor(Cursor.getPredefinedCursor
					(Cursor.CROSSHAIR_CURSOR));
		}
		//позволяет перетаскивать
		public void mouseDragged(MouseEvent event)
		{
			if (current!=null)
			{
					current.setFrame(event.getX()-10, event.getY()-10,20,20);
			repaint();
			}
		}
	}
}
		