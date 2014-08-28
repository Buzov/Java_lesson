package My34;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;


import javax.swing.*;

//слушатель клавиатуры

public class My34 
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
	char c;
	int x,y;
	
	public MyPanel ()
	{
		c='0';
		x=0;
		y=0;
		MyKey listener=new MyKey();
		addKeyListener(listener);
		//вводим панель в фокус
		setFocusable(true);
	}
	public void paintComponent(Graphics g)
	{
		if (x<10) x=getWidth()/2;
		if (y<10) y=getHeight()/2;
		if (x>getWidth()-10) x=getWidth()-10;
		if (y>getHeight()-10) y=getHeight()-10;
		super.paintComponent(g);
		g.drawString(""+c,x,y);
	}
	private class MyKey implements KeyListener
	{
		//вызывается при нажатии на любую клавишу
		public void keyPressed(KeyEvent event)
		{
			System.out.println("Pressed="+event.getKeyCode());
		}
		//вызывается при отпускании любой клавиши
		public void keyReleased(KeyEvent event)
		{
			System.out.println("Released="+event.getKeyCode());
			int d=1;
			if (event.isShiftDown()) d=25;
			int k=event.getKeyCode();
			if (k==KeyEvent.VK_LEFT) x-=d;
			if (k==KeyEvent.VK_RIGHT) x+=d;
			if (k==KeyEvent.VK_UP) y-=d;
			if (k==KeyEvent.VK_DOWN) y+=d;
			repaint();
			
		}
		//показывает какой символ был напечатан (не реагирует на лкавиши без свола)
		public void keyTyped(KeyEvent event)
		{
			/*System.out.println("Typed="+event.getKeyChar());*/
			c=event.getKeyChar();
			repaint();
		}
	}
}
		