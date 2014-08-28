package My49;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//перемещение на экране окружности

public class My49 
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
	private Color color=Color.red;
	private int x=50, y=50;
	private JRadioButton xRadio,yRadio,xyRadio;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,300);
		MyPanel panel=new MyPanel();
		//получение клиентской части
		Container pane=getContentPane();
		pane.add(panel);
		
		Action blueAction=new MyAction("Blue",
				new ImageIcon("dartvejder.gif"),Color.blue);
		Action yellowAction=new MyAction("Yellow",
				new ImageIcon("dartvejder.gif"),Color.yellow);
		Action redAction=new MyAction("Red",
				new ImageIcon("dartvejder.gif"),Color.red);
		Action exitAction=new
				AbstractAction("Exit", new ImageIcon("dartvejder.gif"))
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		};
		exitAction.putValue(Action.SHORT_DESCRIPTION, "Exit");
		JToolBar bar=new JToolBar();
		bar.add(blueAction);
		bar.add(yellowAction);
		bar.add(redAction);
		bar.addSeparator();
		JButton b1=new JButton("<=");
		b1.setToolTipText("left move");
		bar.add(b1);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (xRadio.isSelected()) x-=5;
				if (yRadio.isSelected()) y-=5;
				if (xyRadio.isSelected()) {x-=5;y-=5;}
				repaint();
			}
		});
		JButton b2=new JButton("=>");
		b2.setToolTipText("right move");
		bar.add(b2);
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (xRadio.isSelected()) x+=5;
				if (yRadio.isSelected()) y+=5;
				if (xyRadio.isSelected()) {x+=5;y+=5;}
				repaint();
			}
		});
		xRadio=new JRadioButton ("X");
		yRadio=new JRadioButton ("Y");
		xyRadio=new JRadioButton ("XY");
		xRadio.setToolTipText("move along X");
		xRadio.setToolTipText("move along Y");
		yRadio.setToolTipText("move along XY");
		xyRadio.setSelected(true);
		ButtonGroup group=new ButtonGroup();
		group.add(xRadio);
		group.add(yRadio);
		group.add(xyRadio);
		bar.add(xRadio);
		bar.add(yRadio);
		bar.add(xyRadio);
		bar.addSeparator();
		bar.add(exitAction);
		pane.add(bar, BorderLayout.NORTH);
		
	}
	class MyAction extends AbstractAction
	{
		public MyAction(String name, Icon icon, Color c)
		{
			putValue(Action.NAME,name);
			putValue(Action.SMALL_ICON,icon);
			//пиктограммы подсказки
			putValue(Action.SHORT_DESCRIPTION,name);
			putValue("Color",c);
		}

		@Override
		public void actionPerformed(ActionEvent event) 
		{
			//определене цвета фигуры
			color=(Color)getValue("Color");
			repaint();
			
		}
	}
	
	

class MyPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		//необходиом чтобы текст коректно отрисовывался в окне
		super.paintComponent(g);
		//рисуем 
		g.setColor(color);
		g.fillOval(x, y, 50, 50);
	}
}
}
		
		