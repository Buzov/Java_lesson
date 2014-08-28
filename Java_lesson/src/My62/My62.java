package My62;

import java.awt.*;
import java.awt.event.*;
import java.util.prefs.*;

import javax.swing.*;



public class My62 
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
	private Preferences node;
	private JTextField text;
	public MyFrame()
	{
		node=Preferences.userRoot().node("/com/myjava");
		int left=node.getInt("left",0);
		int top=node.getInt("top",0);
		int width=node.getInt("width",300);
		int height=node.getInt("height",200);
		setBounds(left,top,width,height);
		text=new JTextField(node.get("text", ""));
		
		setTitle(node.get("text", ""));
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent event)
			{
				node.putInt("left",getX());
				node.putInt("top",getY());
				node.putInt("width",getWidth());
				node.putInt("height",getHeight());
				node.put("text",text.getText());
			}
		});
		
		Container pane=getContentPane();
		pane.add(text);
		
	}
	
}	


		