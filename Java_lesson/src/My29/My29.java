package My29;

import java.awt.*;
import java.awt.event.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.*;

import javax.swing.*;

//разные шрифты

public class My29 
{
	public static void main(String[] args)
	{
		System.out.println("It is program My");
		//получение списка шрифтов
		String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (int i=0;i<fontNames.length;i++)
			System.out.println(fontNames[i]);
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
		//рисуем текст в окне
		Graphics2D g2=(Graphics2D) g;
		AffineTransform t=g2.getTransform();
		g.drawString("It is text", 5, 5);
		//создание шрифта
		Font f=new Font("SanasSerif",Font.ITALIC,20);
		g2.setFont(f);
		g2.drawString("It is new text", 5, 33);
		String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (int i=5;i<20;i++)
		{
			g2.rotate(-0.05);
			g2.setColor(new Color(
					(int) (Math.random()*255), (int) (Math.random()*255),(int) (Math.random()*255)));
			Font f1=new Font(fontNames[i],Font.BOLD,20);
			g2.setFont(f1);
			g2.drawString(fontNames[i], 5, 20*i);
		}
		//текст в центре
		
		g2.setTransform(t);//возращение к кординатам, которые запонилив начале
		Font f2=new Font("SanasSerif",Font.ITALIC,20);
		g2.setFont(f2);
		String s="It is center!";
		FontRenderContext context=g2.getFontRenderContext();
		Rectangle2D r=f2.getStringBounds(s, context);
		double x1=(getWidth()-r.getWidth())/2;
		double y1=(getHeight()-r.getHeight())/2;
		double ascent=-r.getY();//узнаем высоту текста
		double y2=y1+ascent;
		Rectangle2D rect=new Rectangle2D.Double(x1,y1,r.getWidth(),r.getHeight());
		g2.setColor(Color.YELLOW);
		g2.fill(rect);
		g2.setColor(Color.red);
		g2.drawString(s, (int) x1, (int) y2);
		g2.setColor(Color.blue);
		g2.draw(new Line2D.Double(x1,y2,x1+r.getWidth(),y2));
		
		g2.draw(rect);
	}
}
		
		