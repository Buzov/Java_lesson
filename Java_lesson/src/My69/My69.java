package My69;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

//робот мыши

public class My69
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
	private Robot robot;
	public MyFrame()
	{
		setTitle("Dart");
		//setSize(300,200);
		JPanel panel=new JPanel();
		//
		GraphicsEnvironment env=GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice screen=env.getDefaultScreenDevice();
		try
		{
			robot=new Robot(screen);
		} catch (AWTException exception) {};
		JButton b1=new JButton("key");
		JButton b2=new JButton("mouse");
		b1.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent event)
			{
				for(int i=0;i<10;i++)
				{
				robot.mouseMove(200, 100+10*i);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.delay(333);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				robot.delay(333);
				robot.keyPress('0');
				robot.keyRelease('0');
				robot.delay(333);
				}
				for(int i=0;i<10;i++)
				{
					robot.delay(333);
					robot.keyPress(KeyEvent.VK_DOWN);
					robot.keyPress(KeyEvent.VK_RIGHT);
					robot.keyPress(KeyEvent.VK_RIGHT);
					robot.delay(333);
					robot.keyPress('A');
					robot.keyRelease('A');
				}
				robot.mouseMove(200, 200);
				robot.mousePress(InputEvent.BUTTON3_MASK);
				robot.delay(333);
				robot.mouseRelease(InputEvent.BUTTON3_MASK);
			}
		});
		b2.addActionListener(new ActionListener ()
		{
			public void actionPerformed(ActionEvent event)
			{
				for(int i=0;i<20;i++)
				{
					robot.delay(333);
					if (i%3==0)
					{
						robot.mouseMove(70+5*i,560+200+200);
						robot.mousePress(InputEvent.BUTTON3_MASK);
						robot.delay(333);
						robot.mouseRelease(InputEvent.BUTTON3_MASK);
						robot.delay(333);
						robot.mousePress(InputEvent.BUTTON3_MASK);
						robot.delay(333);
						robot.mouseRelease(InputEvent.BUTTON3_MASK);
						robot.delay(333);
					}
					robot.mouseMove(200+(int) (Math.random()*222), 70+10*i);
					robot.mousePress(InputEvent.BUTTON1_MASK);
					robot.delay(333);
					robot.mouseMove(200+(int) (Math.random()*222), 111+10*i);
					robot.mouseRelease(InputEvent.BUTTON1_MASK);
				}
				BufferedImage image=robot.createScreenCapture(
							new Rectangle(0,0,500,300));
				ImageFrame frame=new ImageFrame(image);
				frame.show();
			}
		});
		panel.add(b1);
		panel.add(b2);
		//получение клиентской части
		Container pane=getContentPane();
		pane.add(panel);
		//задаем по размеру кнопок окно
		pack();
		
	}
	
}	
class ImageFrame extends JFrame
{
	public ImageFrame(Image image)
	{
		setTitle("Capture image");
		setSize(550,350);
		Container pane=getContentPane();
		JLabel label=new JLabel(new ImageIcon(image));
		pane.add(label);
	}
}

		
		