package My25;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


//������� ��� ���� 
public class My25 
{
	
	public static void main(String[] args)
	{
		System.out.println("It is program My");
		MyFrame frame=new MyFrame(30,30,300,200);
		//������ �������� ����
		frame.setTitle("Dart");
		//�� �������� ������ ����
		frame.setResizable(false);
		//������� �������� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
		MyFrame frame2=new MyFrame(50,50,300,200);
		//������ ������ ����
		Toolkit kit=Toolkit.getDefaultToolkit();
		Image im=kit.getImage("dartvejder.jpg");
		frame2.setIconImage(im);
		//������ ���� �� ���� �����
		frame2.show();
		frame2.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		MyFrame frame3=new MyFrame(40,40,300,200);
		//������� ����� � ����
		frame3.setUndecorated(true);
		frame3.show();
	}

}
class MyFrame extends JFrame
{
	public MyFrame(int x, int y, int w, int h)
	{
		//setSize ������ ������ ����
		//setSize(300,200);
		//setLocation ������ ��������� ���� �� ������ ������������ �������� ������ ����
		//setLocation(x,y);
		//setBounds ������ ������ ����� ��� ��������� �� ������
		//setBounds=setSize+setLocation
		//setBounds(x,y,300,200);
		//��������� ������� ������ �����
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		int lx=screenSize.width;
		int ly=screenSize.height;
		setBounds(x*lx/100-w/2,y*ly/100-h/2,300,200);
	}
}