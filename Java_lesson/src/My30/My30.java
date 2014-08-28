package My30;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

//поворот масива изображений

public class My30
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
	private Image im;
	public MyPanel()
	{
		//try
		//{
		//im=ImageIO.read(new File("dartvejder.jpg"));
		//} catch (IOException escept) {};
		im=Toolkit.getDefaultToolkit().getImage("dartvejder.jpg");
		MediaTracker t=new MediaTracker(this);
		t.addImage(im,0);
		try
		{
			t.waitForID(0);
		} catch (InterruptedException exception) {}
	}
	public void paintComponent(Graphics g)
	{
		//необходиом чтобы текст коректно отрисовывался в окне
		super.paintComponent(g);
		//рисуем текст в окне
		//g.drawString("It is text", 55, 55);
		Graphics2D g2=(Graphics2D) g;
		int dx=im.getWidth(this);
		int dy=im.getWidth(this);
		for (int j=0; j*dy<=getHeight()*2;j++)
		{	for (int i=0; i*dx<=getWidth();i++)
		g2.drawImage(im, i*dx, j*dy/2, dx, dy*(20-i)/20,null);
		g2.rotate(0.05);
		}
	}
}
		
		