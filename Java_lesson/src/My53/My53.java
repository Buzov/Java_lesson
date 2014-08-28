package My53;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;
import javax.swing.event.*;

//выбор цвета в трех различных вспомогательных окнах

public class My53
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
	private Color c;
	private JColorChooser chooser, chooser2;
	private JDialog dialog, dialog2;
	public MyPanel()
	{
		c=Color.red;
		JButton b1=new JButton("Modal");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Color c0; 
				c0=JColorChooser.showDialog(null, 
						"Setcolor",c);
				if (!(c0==null)) c=c0;
				repaint();
			}
		});
		add(b1);
		JButton b2=new JButton("No Modal");
		b2.addActionListener(new ActionListener()
		{
			
			{	chooser=new JColorChooser();
			dialog=JColorChooser.createDialog(null, 
						"Setcolor", 
						false, 
						chooser, 
						new ActionListener()
							{
								public void actionPerformed(ActionEvent event)
									{
										c=chooser.getColor();
										repaint();
									}
							}, 
						null);
			}
			public void actionPerformed(ActionEvent event)
			{
				chooser.setColor(c);
				dialog.show();
			}
		});
		add(b2);
		JButton b3=new JButton("Immediate");
		b3.addActionListener(new ActionListener()
		{
			
			{	chooser2=new JColorChooser();
			    chooser2.getSelectionModel().addChangeListener(new
					ChangeListener()
						{
							public void stateChanged(ChangeEvent event)
							{
								c=chooser2.getColor();
								repaint();
							}
						});
			dialog2=new JDialog((Frame)null,false);
			dialog2.getContentPane().add(chooser2);
			dialog2.pack();
			}
			public void actionPerformed(ActionEvent event)
			{
				chooser2.setColor(c);
				dialog2.show();
			}
		});
		add(b3);
	}
	public void paintComponent(Graphics g)
	{
		//необходиом чтобы текст коректно отрисовывался в окне
		super.paintComponent(g);
		//рисуем 
		g.setColor(c);
		g.fillOval(50,50,200,100);
	}
}
		
		