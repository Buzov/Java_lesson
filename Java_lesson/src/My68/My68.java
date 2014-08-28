package My68;

import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;

import javax.swing.*;

//исключения

public class My68 
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
	private double[] a=new double[10];
	private JTextField text;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		//получение клиентской части
		Container pane=getContentPane();
		Box panel=new Box(BoxLayout.Y_AXIS);
		pane.add(panel);
		ButtonGroup group=new ButtonGroup();
		JRadioButton button;
		button=new JRadioButton("Integer divide by zero",false);
		panel.add(button);
		group.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{try{
				System.out.println("1");
				a[1]=1/(a.length-a.length);
				System.out.println("2");
			}catch(Exception e){text.setText(e.toString());}
			System.out.println("3");
			}
			
		});
		button=new JRadioButton("Floating point divide by zero",false);
		panel.add(button);
		group.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				a[1]=1/(2.5-2.5);
				text.setText(""+a[1]);
		
			}
			
		});
		button=new JRadioButton("Array bounds",false);
		panel.add(button);
		group.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{try{
				System.out.println("1");
				a[1]=a[25];
				System.out.println("2");
			}catch(Exception e){text.setText(e.toString());}
			System.out.println("3");
			}
			
		});
		button=new JRadioButton("Bad cast",false);
		panel.add(button);
		group.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{try{
				System.out.println("1");
				a=(double[])event.getSource();
				System.out.println("2");
			}catch(Exception e){text.setText(e.toString());}
			System.out.println("3");
			}
			
		});
		button=new JRadioButton("Null pointer",false);
		panel.add(button);
		group.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{try{
				event=null;
				System.out.println(event.getSource());
			}catch(Exception e){text.setText(e.toString());}
			System.out.println("3");
			}
			
		});
		button=new JRadioButton("sqrt(-1)",false);
		panel.add(button);
		group.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{try{
				System.out.println("1");
				a[1]=Math.sqrt(-1);
				text.setText(""+a[1]);
				System.out.println("2");
			}catch(Exception e){text.setText(e.toString());}
			System.out.println("3");
			}
			
		});
		button=new JRadioButton("Overflow",false);
		panel.add(button);
		group.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{try{
				a[1]=1000*1000*1000*1000;
				int n=(int) a[1];
				text.setText(""+n+"="+a[1]+"1000000000?");
				System.out.println("2");
			}catch(Exception e){text.setText(e.toString());}
			System.out.println("3");
			}
			
		});
		button=new JRadioButton("No such file",false);
		panel.add(button);
		group.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{try{
				FileInputStream in=new FileInputStream("aaaaaaaaa");
				System.out.println("2");
			}catch(Exception e){text.setText(e.toString());}
			System.out.println("3");
			}
			
		});
		button=new JRadioButton("Throw unknown errer",false);
		panel.add(button);
		group.add(button);
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{try{
				throw new UnknownError();
			}catch(Exception e){text.setText(e.toString());}
			System.out.println("3");
			}
			
		});
		text=new JTextField(30);
		panel.add(text);
		pack();
		
	}
	
}	


		
