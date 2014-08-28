package My51;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//Диалоговые окна

public class My51 
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
	private MyDialog d1,d2;
	private JTextArea area;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		Container pane=getContentPane();
		JPanel panel=new JPanel();
		pane.add(panel, BorderLayout.NORTH);
		JButton b1=new JButton("Modal Dialog");
		panel.add(b1);
		area=new JTextArea();
		pane.add(area);
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (d1==null) d1=new MyDialog(null,true);
				if (d1.MyShow()) area.append(d1.getText()+"\n");
			}

			
		});
		JButton b2=new JButton("Dialog");
		panel.add(b2);
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (d2==null) d2=new MyDialog(null,false);
				d2.MyShow();
			}

			
		});
		
	}		
		class MyDialog extends JDialog
		{
			private boolean ok;
			private JTextField text;
			public MyDialog(final JFrame frame, final boolean modal)
			{
				//вызовем конструктор родительского класа true-модальныйдиалог
				super(frame,"Dialog",modal);
				setSize(150,100);
				Container pane=getContentPane();
				JPanel panel=new JPanel();
				pane.add(panel, BorderLayout.SOUTH);
				JButton b1=new JButton("Ok");
				panel.add(b1);
				b1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						ok=true; setVisible(false);
						//проверка модальности окна
						if (!modal) area.append(text.getText()+"\n");
					}

					
				});
				
				JButton b2=new JButton("Cancel");
				panel.add(b2);
				b2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						setVisible(false);
					}
				});
				text=new JTextField("",10);
				pane.add(text);
				
		}
			public boolean MyShow()
			{
				ok=false;
				text.setText("");
				show();
				return ok;
			}
			public String getText()
			{
				return text.getText();
			}
		
	}
	
}



		
		