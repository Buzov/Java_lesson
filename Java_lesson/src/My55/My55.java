package My55;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class My55 
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
		
		
		Container pane=getContentPane();
		//задаем сетку в окне
		GridBagLayout layout=new GridBagLayout();
		pane.setLayout(layout);
		JLabel field1=new JLabel("Field 1:");
		JLabel field2=new JLabel("Field (ComboBox)");
		JTextField text=new JTextField("TextField");
		JComboBox box=new JComboBox(new String[]{"Combo","Box"});
		JCheckBox check=new JCheckBox("CheckBox");
		JButton button=new JButton("Button");
		JTextArea area=new JTextArea("It is text area");
		//
		GridBagConstraints constrains=new GridBagConstraints();
		
		constrains.weightx=0;
		constrains.weighty=0;
		constrains.anchor=GridBagConstraints.EAST;
		constrains.fill=GridBagConstraints.NONE;
		add(field1,constrains,0,0,1,1);
		add(field2,constrains,0,1,1,1);
		
		constrains.weightx=100;
		constrains.anchor=GridBagConstraints.CENTER;
		constrains.fill=GridBagConstraints.HORIZONTAL;
		add(text,constrains,1,0,1,1);
		add(box,constrains,1,1,1,1);
		
		constrains.weighty=100;
		constrains.fill=GridBagConstraints.NONE;
		add(check,constrains,0,2,2,1);
		add(button,constrains,0,3,2,1);
		constrains.fill=GridBagConstraints.BOTH;
		constrains.weightx=5000;
		add(area,constrains,2,0,1,4);
		
	}
	public void add(Component c, GridBagConstraints constrains,
			int x,int y,int w, int h)
	{
		constrains.gridx=x;
		constrains.gridy=y;
		constrains.gridwidth=w;
		constrains.gridheight=h;
		getContentPane().add(c,constrains);
	}
	
}	


		
