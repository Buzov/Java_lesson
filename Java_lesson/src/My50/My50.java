package My50;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//Окошко с выпадающими окнами

public class My50 
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
	private JLabel label;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		
		//получение клиентской части
		Container pane=getContentPane();
		JPanel panel=new JPanel();
		pane.add(panel, BorderLayout.NORTH);
		label=new JLabel("",JLabel.CENTER);
		pane.add(label);
		JButton b1=new JButton("Massage");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//информационное сообщение null-выбор центра экрана
				JOptionPane.showMessageDialog(null, "It is message",
						"My message",JOptionPane.INFORMATION_MESSAGE);
			}
			
		});
		panel.add(b1);
		JButton b2=new JButton("Confirm");
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText(""+
				//информационное сообщение
				JOptionPane.showConfirmDialog(MyFrame.this, 
						new JButton("It is confirm"),
						"My confirm",JOptionPane.WARNING_MESSAGE));
			}
			
		});
		panel.add(b2);
		
		JPanel panel2=new JPanel();
		pane.add(panel2, BorderLayout.SOUTH);
		
		JButton b3=new JButton("Option");
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				ImageIcon[] im={new ImageIcon("dartvejder.gif"),
						new ImageIcon("dartvejder.gif"),
						new ImageIcon("dartvejder.gif")};
				label.setText(""+
				//информационное сообщение
				JOptionPane.showOptionDialog(null, 
						"It is Option Dialog",
						"My Option Dialog",
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						im[0],im,im[2]));
			}
			
		});
		panel2.add(b3);
		
		JButton b4=new JButton("InputDialog");
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				ImageIcon[] im={new ImageIcon("dartvejder.gif"),
						new ImageIcon("dartvejder.gif"),
						new ImageIcon("dartvejder.gif")};
				label.setText(""+
				//информационное сообщение
				JOptionPane.showInputDialog(null, 
						"It is Input Dialog",
						"My Input Dialog",
						
						JOptionPane.QUESTION_MESSAGE,
						im[0],im,im[2]));
			}
			
		});
		panel2.add(b4);
		
		JButton b5=new JButton("Input Text");
		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText(""+
				//информационное сообщение
				JOptionPane.showInputDialog(null, 
						"It is Input Dialog",
						"My Input Dialog"));
			}
			
		});
		panel2.add(b5);
	}
	
}	

