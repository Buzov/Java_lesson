package My63;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.Buffer;

import javax.swing.*;

//чтение и запись в файл

public class My63
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
	private JTextArea text;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		text=new JTextArea();
		JButton b1=new JButton("read");
		JButton b2=new JButton("write");
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			
			{
				try
				{
				//FileWriter f=new FileWriter("my.txt");
				OutputStreamWriter f=new OutputStreamWriter(new 
						FileOutputStream("my.txt"),"Cp1251");
				PrintWriter out=new PrintWriter(f);
				out.print(text.getText());
				out.close();
				} catch (IOException exception){}
			}
		});
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			
			{
				try
				{
					//FileReader не всегда удачно работает с кирилицей
				//FileReader f=new FileReader("my.txt");
					//Добавление "Cp1251" позволяет работать с кирилицей
				InputStreamReader f=new InputStreamReader(new 
						FileInputStream("my.txt"),"Cp1251");
				BufferedReader in=new BufferedReader(f);
				String s;
				text.setText("");
				//чтение документа по строкам
				while ((s=in.readLine())!=null)
				{
					text.append(s+"\n");
				}
				in.close();
				} catch (IOException exception){}
			}
		});
		
		JScrollPane scr=new JScrollPane(text);
		JPanel panel=new JPanel();
		panel.add(b1);
		panel.add(b2);
		Container pane=getContentPane();
		pane.add(scr,BorderLayout.CENTER);
		pane.add(panel,BorderLayout.NORTH);
		
	}
	
}	


		