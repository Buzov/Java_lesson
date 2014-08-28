package My32;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//смена цвета окна при помощи клавиш

public class My32 
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

class MyPanel extends JPanel implements ActionListener
{
	public Color backgroundColor;

	public MyPanel()
	{
		/*JButton yellowButton = new JButton("Yellow");
		add(yellowButton);
		JButton blueButton = new JButton("Blue");
		add(blueButton);
		JButton redButton = new JButton("Red");
		add(redButton);
		MyAction2 myRed=new MyAction2(Color.red);
		redButton.addActionListener(myRed);
		MyAction2 myBlue=new MyAction2(Color.blue);
		blueButton.addActionListener(myBlue);
		MyAction2 myYellow=new MyAction2(Color.yellow);
		yellowButton.addActionListener(myYellow);*/
		makeButton("yellow");
		makeButton("blue");
		makeButton("red");
		makeButton("green");
	}
//метод создания кнопки
	void makeButton(String name)
	{
		JButton button = new JButton(name);
		add(button);
		/*MyAction2 myAction=new MyAction2(c);*/
		button.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Color backgroundColor=Color.white;
		String s=event.getActionCommand();
		if (s.equals("yellow"))backgroundColor=Color.yellow;
		if (s.equals("blue"))backgroundColor=Color.blue;
		if (s.equals("red"))backgroundColor=Color.red;
		if (s.equals("green"))backgroundColor=Color.green;
		
		int selection=JOptionPane.showConfirmDialog(null, "Color ?");
		if (selection==JOptionPane.YES_OPTION)
		{
			setBackground(backgroundColor);
		}
		else
		{if (selection==JOptionPane.CANCEL_OPTION)
		setBackground(Color.white);
		
		}
	}
//в этом класе должен находиться обработчик событий кнопок
/*class MyAction implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		JOptionPane.showMessageDialog(null, "Color ?");
		setBackground(Color.red);
	}
}*/

/*class MyAction2 implements ActionListener
{
	private Color backgroundColor;
	public MyAction2(Color c)
	{
		backgroundColor = c;
	}
	public void actionPerformed(ActionEvent event)
	{
		if (backgroundColor==Color.red)
		JOptionPane.showMessageDialog(null, "Color ?");
		setBackground(backgroundColor);
	}
}*/

/*class MyAction3 implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		JOptionPane.showMessageDialog(null, "Color ?");
		setBackground(Color.yellow);
	}
}
*/
}
	