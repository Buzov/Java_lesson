package My47;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

//ввод даты

public class My47 
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
	private JPanel panel, panel2;
	private JButton button;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(600,200);
		panel=new JPanel();
		panel2=new JPanel();
		button=new JButton ("Ok");
		panel2.add(button);
		JSpinner sp1=new JSpinner();
		addRow(sp1);
		JSpinner sp2=new JSpinner(new SpinnerNumberModel(5,2,Double.MAX_VALUE,0.6));
		addRow(sp2);
		JSpinner sp3=new JSpinner(new SpinnerDateModel());
		addRow(sp3);
		//список всех шрифтов
		String[] fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().
				getAvailableFontFamilyNames();
		JSpinner sp4=new JSpinner(new SpinnerListModel(fonts));
		addRow(sp4);
		
		//получение клиентской части
		Container pane=getContentPane();
		panel.setLayout(new GridLayout(4,3));
		pane.add(panel, BorderLayout.CENTER);
		pane.add(panel2, BorderLayout.SOUTH);
		
	}
	public void addRow(final JSpinner sp)
	{
		panel.add(sp);
		//
		final JLabel l1=new JLabel();
		final JLabel l2=new JLabel();
		panel.add(l1);
		panel.add(l2);
		button.addActionListener(new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Object v1=sp.getValue();
				l1.setText(v1.toString());
				Object v2=sp.getNextValue();
				l2.setText(v2.toString());
			}
		});
		
	}
	
}	
