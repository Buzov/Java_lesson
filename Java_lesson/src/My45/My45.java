package My45;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

//редактирование выпадающего меню

public class My45 
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
	private JComboBox combo;
	private JLabel label;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		
		//получение клиентской части
		Container pane=getContentPane();
		JPanel comboPanel=new JPanel();
		JPanel buttonPanel=new JPanel();
		label=new JLabel();
		combo=new JComboBox();
		//добавка возможности редактирования
		combo.setEditable(true);
		//вставка в бокс список
		combo.addItem("import java.awt.*;");
		combo.addItem("import java.awt.event.*;");
		combo.addItem("import javax.swing.*;");
		//отображение текста на окне при выборе в списке
		combo.addActionListener(new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				label.setText((String)combo.getSelectedItem());
			}
		});
		//новая кнопка для встакви
		JButton button1=new JButton("Add");
		button1.addActionListener(new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				combo.addItem((String)combo.getSelectedItem());
			}
		});
		buttonPanel.add(button1);
		
		JButton button2=new JButton("Insert");
		button2.addActionListener(new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				combo.insertItemAt((String)combo.getSelectedItem(),0);
			}
		});
		buttonPanel.add(button2);
		//кнопка для удаления
		JButton button3=new JButton("Delete");
		button3.addActionListener(new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				combo.removeItemAt(0);
			}
		});
		buttonPanel.add(button3);
		//кнопка для очистки
		JButton button4=new JButton("Clear");
		button4.addActionListener(new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				combo.removeAllItems();
			}
		});
		buttonPanel.add(button4);
		
		
		comboPanel.add(combo);
		pane.add(label,BorderLayout.CENTER);
		pane.add(comboPanel,BorderLayout.SOUTH);
		pane.add(buttonPanel,BorderLayout.NORTH);
		
		
	}
	
}	
	
		