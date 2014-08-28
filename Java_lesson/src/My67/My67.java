package My67;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

import javax.swing.*;

//вывод содержимого папки

public class My67
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
	private JComboBox box;
	private JTextArea text;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		box=new JComboBox();
		box.addActionListener(new ActionListener()
				
		{
			public void actionPerformed(ActionEvent event)
			{
				File pathName=new File((String)box.getSelectedItem());
				File[] f=pathName.listFiles();
				text.setText("");
				for (int i=0;i<f.length;i++)
				{
					if (f[i].isFile())
					
						text.append(f[i].getName()+"\n");
					
				}
			}
		});
		text=new JTextArea();
		JPanel panel=new JPanel();
		JScrollPane scroll=new JScrollPane(text);
		panel.add(box);
		//scroll.add(text);
		//получение клиентской части
		Container pane=getContentPane();
		pane.add(panel,BorderLayout.NORTH);
		pane.add(scroll,BorderLayout.CENTER);
		dir("");
		
	}
	public void dir(String s)
	{
		if (s=="") s="..";
		try
		{
			File pathName=new File(s);
			String[] fileNames=pathName.list();
			for (int i=0;i<fileNames.length;i++)
			{
				File f=new File(pathName.getPath(),fileNames[i]);
				if (f.isDirectory())
				{
					box.addItem(f.getCanonicalPath());
					dir(f.getPath());
				}
			}
			
		}catch (IOException e){}
	}
	
}	


		
		