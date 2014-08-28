package My44;

import java.awt.*;
import java.awt.event.*;

import javax.swing.border.*;
import javax.swing.*;


//панели вокруг кнопок
public class My44
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
	private JPanel panel1, panel2;
	private ButtonGroup group1, group2;
	private JCheckBox check1,check2;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		panel1=new JPanel();
		group1=new ButtonGroup();
		panel2=new JPanel();
		group2=new ButtonGroup();
		
		addRadioButton("Lowered bevel",
				BorderFactory.createLoweredBevelBorder());
		addRadioButton("Raised bevel",
				BorderFactory.createRaisedBevelBorder());
		//метод гравировки
		addRadioButton("Etched",
				BorderFactory.createEtchedBorder());
		//рамка виде линии определенного цвета
		addRadioButton("Line",
				BorderFactory.createLineBorder(Color.red));
		//толстая закрашенная рамка
		addRadioButton("Matte",
				BorderFactory.createMatteBorder(12,12,12,12,Color.blue));
		//рамка мощенная картинками
		addRadioButton("Icon",
				BorderFactory.createMatteBorder(12,12,12,12,new ImageIcon("dartvejder.gif")));
		//пустая рамка
		addRadioButton("Emty",
				BorderFactory.createEmptyBorder());
		//толстая закрашенная рамка с круглыми краями
		addRadioButton("Lane2",
				new LineBorder(Color.red,10,true));
		check1=new JCheckBox("Title");
		panel1.add(check1);
		check2=new JCheckBox("Title");
		panel2.add(check2);
		//получение клиентской части
		Container pane=getContentPane();
		pane.setLayout(new GridLayout(2,1));
		pane.add(panel1);
		pane.add(panel2);
		
	}
	public void addRadioButton(String name, final Border b)
	{
		JRadioButton button1=new JRadioButton(name);
		button1.addActionListener(new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (check1.isSelected())//есди нажат первый флажок
				{//выбор панели с надписью вверху
				Border b1=BorderFactory.createTitledBorder(b,"Border types");
				panel1.setBorder(b1);
				} else panel1.setBorder(b);
			}
		});
		group1.add(button1);
		panel1.add(button1);

		JRadioButton button2=new JRadioButton(name);
		button2.addActionListener(new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (check2.isSelected())//если нажат второй флажок
				{
				Border b2=BorderFactory.createTitledBorder(b,"Border types");
				panel2.setBorder(b2);
				} else panel2.setBorder(b);
			}
		});
		group2.add(button2);
		panel2.add(button2);
	}
}	
	

	
		