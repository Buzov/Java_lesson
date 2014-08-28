package My39;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

//калькулятор

public class My39 
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
		//setSize(300,200);
		
		//получение клиентской части
		Container pane=getContentPane();
		MyPanel panel=new MyPanel();
		pane.add(panel);
		//задает размер окна по размерам воих составляющих
		pack();
			
	}
	
}	

class MyPanel extends JPanel
{
	//область для текста
	private JLabel display;
	private JPanel panel;
	private boolean start;
	private String lastCommand;
	private double result;
	public MyPanel()
	{
		
		//
		setLayout(new BorderLayout());
		start=true;
		result=0;
		lastCommand="=";
		display=new JLabel("0");
		add(display,BorderLayout.NORTH);
		panel=new JPanel();
		//сетка кнопок
		panel.setLayout(new GridLayout(4,4));
		addButton("7",0);
		addButton("8",0);
		addButton("9",0);
		addButton("/",1);
		
		addButton("4",0);
		addButton("5",0);
		addButton("6",0);
		addButton("*",1);
		
		addButton("1",0);
		addButton("2",0);
		addButton("3",0);
		addButton("-",1);
		
		addButton("0",0);
		addButton(".",0);
		addButton("=",1);
		addButton("+",1);
		add(panel, BorderLayout.CENTER);
		
		
		
	}
	private void addButton (String s, int i)
	{
		JButton button=new JButton(s);
		if(i==0)
		{
			button.addActionListener(new InsertAction());
		}
		if(i==1)
		{
			button.addActionListener(new CommandAction());
		}
		panel.add(button);
	}
	private class InsertAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			//получение текста на кнопкке
			String input=event.getActionCommand();
			if (start)
			{
				display.setText("");
				start=false;
			}
			if (!input.equals(".")||(display.getText().lastIndexOf(".")<0))
			display.setText(display.getText()+input);
		}
	}
	private class CommandAction implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			String command=event.getActionCommand();
			if (start)
			{
				if(command.equals("-"))
				{
					display.setText(command);
					start=false;
				}
				else lastCommand=command;
			} else
			{if (!display.getText().equals("-"))
				calculate(Double.parseDouble(display.getText()));
				lastCommand=command;
				start=true;
			}
		}
		
	}
	public void calculate(double x)
	{
		if (lastCommand.equals("+")) result+=x;
		else if (lastCommand.equals("-")) result-=x;
		else if (lastCommand.equals("*")) result*=x;
		else if (lastCommand.equals("/")) result/=x;
		else if (lastCommand.equals("=")) result=x;
		display.setText(""+result);
	}
}
		
		