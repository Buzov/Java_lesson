package My41;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;
import java.net.*;

import javax.swing.*;
import javax.swing.text.*;

//��������������� ����

//���� ������
public class My41 
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
	private JButton ok;
	private JPanel mPanel;
	public MyFrame()
	{
		setTitle("Dart");
		setSize(500,200);
		//��������� ���������� �����
		//� ��������� ����������� ������
		Container pane=getContentPane();
		JPanel bPanel=new JPanel();
		ok=new JButton("Ok");
		bPanel.add(ok);
		pane.add(bPanel, BorderLayout.SOUTH);
		
		mPanel=new JPanel();
		mPanel.setLayout(new GridLayout(0,3));
		pane.add(mPanel, BorderLayout.CENTER);
		
		final JPasswordField pField=new JPasswordField("password",10);
		mPanel.add(new JLabel("Password"));
		mPanel.add(pField);
		final JLabel vLabel=new JLabel();
		mPanel.add(vLabel);
		ok.addActionListener( new 
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				char[] c=pField.getPassword();
				String s="";
				for (int i=0; i<c.length;i++)
					s+=c[i];
				vLabel.setText(s);
						
			}
		});
		//����� ���� �� ������ � �������
		JFormattedTextField iField=new JFormattedTextField(
			NumberFormat.getIntegerInstance());
		iField.setValue(new Integer(100));
		addRow("Number",iField);
		//���� ��������� �������
		JFormattedTextField cField=new JFormattedTextField(
				NumberFormat.getCurrencyInstance());
			cField.setValue(new Double(50));
			addRow("Currency",cField);
		//���� ��� ����� ���
		JFormattedTextField dField=new JFormattedTextField(
				DateFormat.getDateInstance());
			dField.setValue(new Date());
			addRow("Date(default)",dField);
		//���� ����� ������ ����
		JFormattedTextField dField2=new JFormattedTextField(
				DateFormat.getDateInstance(DateFormat.SHORT));
			dField2.setValue(new Date());
			addRow("Date(short)",dField2);
		//���� ����� �������� �������
		try
		{	DefaultFormatter f=new DefaultFormatter();
			f.setOverwriteMode(false);
			JFormattedTextField urlField=new JFormattedTextField(f);
			
			urlField.setValue(new URL("http://java.sun.com"));
			addRow("URL",urlField);
		} catch (MalformedURLException exception)
			{
			
			}
		try
		//# - �� ���� ����� ������ ���� ������ �����
		//? - �� ���� ����� ������ ���� ������ �����
		//U - �� ���� ����� ������ ���� ������ ��������� �����
		//- - �� ���� ����� ����� ���� ����� ����������� ������
		//L - �� ���� ����� ������ ���� ������ �������� �����
		//A - �� ���� ����� ������ ���� ��� ����� ��� �����
		//H - ����� � 16-������ �������
		//* - �� ���� ����� ����� ���� ����� ������
		{	MaskFormatter f=new MaskFormatter("#?U-LAH*");
			
			JFormattedTextField mField=new JFormattedTextField(f);
			
			mField.setValue("1aA-s7Bt");
			addRow("Mask",mField);
		} catch (ParseException exception)
			{
			
			}
		
			
		
	}
	public void addRow(String s,final JFormattedTextField field)
	{
		mPanel.add(new JLabel(s));
		mPanel.add(field);
		final JLabel vLabel=new JLabel();
		mPanel.add(vLabel);
		ok.addActionListener( new 
				ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				Object value = field.getValue();
				vLabel.setText(value.toString());
						
			}
		});
	}
	
}	

		
		