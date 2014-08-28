package My61;

import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import javax.swing.*;



public class My61 
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
	private Properties settings;
	private JTextField text;
	
	
	public MyFrame()
	{
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{
				settings.put("width",""+getWidth());
				settings.put("height",""+getHeight());
				settings.put("text",text.getText());
				try
				{
					FileOutputStream out=
					new FileOutputStream("My.ini");
					settings.store(out,"My.ini");
				} catch (IOException exception){}
			}
		});
		//setSize(300,200);
		//настройки программы
		settings=new Properties();
		try
		{
			FileInputStream in=
			new FileInputStream("My.ini");
			settings.load(in);
		} catch (IOException exception){}
		int h=Integer.parseInt(settings.getProperty("height","200"));
		int w=Integer.parseInt(settings.getProperty("width","300"));
		setSize(w,h);
		text=new JTextField(settings.getProperty("text"));
		setTitle(settings.getProperty("text"));
		int red=Integer.parseInt(settings.getProperty("color.red","100"));
		int green=Integer.parseInt(settings.getProperty("color.green","100"));
		int blue=Integer.parseInt(settings.getProperty("color.blue","100"));
		int size=Integer.parseInt(settings.getProperty("font.size","100"));
		String font=settings.getProperty("font.name","serif");
		text.setFont(new Font(font,Font.BOLD,size));
		text.setForeground(new Color(red,green,blue));
		getContentPane().add(text);
	}
	
}	

	
		