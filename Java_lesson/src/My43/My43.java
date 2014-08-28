package My43;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;


//�����
public class My43 
{
	public static void main(String[] args)
	{
		System.out.println("It is program My");
		MyFrame frame=new MyFrame();
		//������� �������� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	
	}

}

class MyFrame extends JFrame
{
	//������
	private JCheckBox bold, italic;
	private JLabel l5;
	private JPanel panel3;
	private ButtonGroup group;
	public MyFrame()
	{
		
		setTitle("Dart");
		setSize(300,200);
		//��������� ���������� �����
		Container pane=getContentPane();
		//������ ��� �����
		JPanel panel=new JPanel();
		//������� �������� ����������
		panel.setLayout(new GridLayout(5,0));
		JLabel l1=new JLabel("left",JLabel.LEFT);
		JLabel l2=new JLabel("right",JLabel.RIGHT);
		JLabel l3=new JLabel("center",JLabel.CENTER);
		JLabel l4=new JLabel("icon",new ImageIcon("dartvejder.gif"),JLabel.CENTER);
		l5=new JLabel("It is text",JLabel.CENTER);
		//������ ������
		Font f=new Font("Serif",Font.PLAIN,20);
		l1.setFont(f);
		l2.setFont(f);
		l3.setFont(f);
		l4.setFont(f);
		
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		panel.add(l5);
		pane.add(panel);
		//������� ������ ������ ��� �������
		JPanel panel2=new JPanel();
		bold=new JCheckBox("Bold",true);
		italic=new JCheckBox("Italic");
		italic.setSelected(true);
		l5.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,20));
		panel2.add(bold);
		panel2.add(italic);
		
		
		ActionListener listener=new
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				int mode=0;
				if (bold.isSelected()) mode+=Font.BOLD;
				if (italic.isSelected()) mode+=Font.ITALIC;
				l5.setFont(new Font("Serif",mode,20));
			}
		};
		bold.addActionListener(listener);
		italic.addActionListener(listener);
		pane.add(panel2, BorderLayout.SOUTH);
		
		panel3=new JPanel();
		//������ ��������������
		group=new ButtonGroup();
		addRadioButton("Left",JLabel.LEFT);
		addRadioButton("Center",JLabel.CENTER);
		addRadioButton("Right",JLabel.RIGHT);
		pane.add(panel3, BorderLayout.NORTH);
		
	}
	
	public void addRadioButton(String name, final int align)
	{
		//���������� ���������� ��������� ���������
		boolean selected=align==JLabel.CENTER;
		JRadioButton button=new JRadioButton(name,selected);
		group.add(button);
		panel3.add(button);
		button.addActionListener(new 
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				l5.setHorizontalAlignment(align);
			}
		});
			
		
	}
	
	
}	

