package My31;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;
import javax.swing.*;

//заливка контура

public class My31 
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
	public void paintComponent(Graphics g)
	{
		//необходиом чтобы текст коректно отрисовывался в окне
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		Ellipse2D e0=new Ellipse2D.Double(3,11,333,33);
		g2.clip(e0);//обрезка
		Ellipse2D e1=new Ellipse2D.Double(3,2,111,44);
		g2.clip(e1);
		for (int i=0;i<50;i++)
		{
			Line2D l=new Line2D.Double(0,i*5,300,i*5);
			g2.draw(l);
		}
		g2.setClip(null);
		g2.draw(e0);
		g2.draw(e1);
		g2.setColor(Color.red);
		for (int i=0;i<50;i++)
		{
			Line2D l=new Line2D.Double(0,i*5+55,300,i*5+55);
			g2.draw(l);
		}
		g2.setColor(Color.blue);
		g2.setXORMode(new Color(255,255,255));
		Ellipse2D e2=new Ellipse2D.Double(3,55,111,44);
		g2.fill(e2);
		g2.setXORMode(new Color(255,0,255));
		Ellipse2D e3=new Ellipse2D.Double(122,55,55,44);
		g2.fill(e3);
		g2.setPaintMode();
		Ellipse2D e4=new Ellipse2D.Double(222,55,55,44);
		g2.fill(e4);
		g2.setComposite(AlphaComposite.Clear);//метод наложения
		Ellipse2D e5=new Ellipse2D.Double(2,111,55,44);
		g2.fill(e5);
		g2.setComposite(AlphaComposite.SrcOver);
		BufferedImage im;
		try
		{
			im=ImageIO.read(new File("dartvejder.jpg"));
			g2.setPaint(new TexturePaint(im,
					new Rectangle2D.Double(0,0,22,111)));
			Ellipse2D e6=new Ellipse2D.Double(55,111,77,44);
			g2.fill(e6);
			
			g2.setPaint(new TexturePaint(im,
					new Rectangle2D.Double(11,0,11,22)));
			Ellipse2D e7=new Ellipse2D.Double(130,111,77,44);
			g2.fill(e7);
		}catch(IOException exception){}
		//смещение куска экрана
		g2.copyArea(44, 77, 88, 55, 133, 12);
		
	
	}
}
		
		