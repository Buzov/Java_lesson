package My54;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Компоновка окна пружины

public class My54 
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
		
		
		JLabel label1=new JLabel("Name");
		JTextField text1=new JTextField(10);
		//максимальный размер области
		text1.setMaximumSize(text1.getPreferredSize());
		//горизонтальная компоновка
		Box hbox1=Box.createHorizontalBox();
		hbox1.add(label1);
		//распорка
		hbox1.add(Box.createHorizontalStrut(10));
		hbox1.add(text1);
		
		JLabel label2=new JLabel("Password");
		JTextField text2=new JTextField(10);
		//максимальный размер области
		text2.setMaximumSize(text2.getPreferredSize());
		//горизонтальная компоновка
		Box hbox2=Box.createHorizontalBox();
		hbox2.add(Box.createGlue());//сшивка пружиной
		hbox2.add(label2);
		//распорка
		hbox2.add(Box.createHorizontalStrut(20));
		hbox2.add(text2);
		hbox2.add(Box.createGlue());//
		JCheckBox check=new JCheckBox();
		hbox2.add(check);
		hbox2.add(Box.createGlue());//
		
		Box hbox3=Box.createHorizontalBox();
		JButton b1=new JButton("Ok");
		JButton b2=new JButton("Cancel");
		hbox3.add(b1);
		hbox3.add(Box.createGlue());//сшивка пружиной
		hbox3.add(b2);
		
		Box vbox=Box.createVerticalBox();
		vbox.add(Box.createVerticalStrut(5));
		vbox.add(hbox1);
		vbox.add(Box.createVerticalStrut(15));//сшивка пружиной
		vbox.add(hbox2);
		vbox.add(Box.createGlue());//сшивка пружиной
		vbox.add(hbox3);
		Container pane=getContentPane();
		pane.add(vbox,BorderLayout.CENTER);
		
		
	}
	
}	


		