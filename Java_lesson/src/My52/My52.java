package My52;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;


//����� ����� � ��������
public class My52
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
	private JFileChooser file;
	private JTextArea text;
	private JTextField text2;
		public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		Container pane=getContentPane();
		JPanel panel=new JPanel();
		pane.add(panel,BorderLayout.NORTH);
		JButton b=new JButton("File");
		text2=new JTextField("TextField");
		panel.add(b);
		panel.add(text2);
		text=new JTextArea();
		pane.add(text);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				//�������� ������������� �����
				if (file==null) 
				{file=new JFileChooser();
				file.setCurrentDirectory(new File("."));
				file.setFileFilter(new MyFilter());
				}
				//���a� ���� � ���������� �����
				if (file.showDialog(null, "Select")==JFileChooser.APPROVE_OPTION);
				text.append(file.getSelectedFile().getPath()+"\n");
				text2.setText(file.getSelectedFile().getPath()+"\n");
			}
		});
		
	}
	
}
class MyFilter extends FileFilter
{
	public boolean accept(File f)
	{
		return f.getName().toLowerCase().endsWith(".txt")//�������� �� � ����� ���������� �����
				|| f.isDirectory(); //�������� �� ��� �����������
	}
	public String getDescription()
	{
		return "txt files";
	}
}

class MyPanel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		//���������� ����� ����� �������� ������������� � ����
		super.paintComponent(g);
		//������ ����� � ����
		g.drawString("It is text", 55, 55);
	}
}
		
		