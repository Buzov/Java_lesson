package My23;

import java.awt.event.*;
import java.text.*;
import javax.swing.*;
//import javax.management.timer.Timer;

//работа с таймером

public class My23 
{
	public static void main (String[] args)
	
	{
		System.out.println("It is program My23");
		BankAccount account=new BankAccount(100000);
		account.start(10);
		JOptionPane.showMessageDialog(null,"Exit ?");
		System.exit(0);
	}
}
class BankAccount
{
	private double balance;
	public BankAccount(double b)
	{
		balance=b;
	}
	public void start(double rate)
	{
		ActionListener adder=new InterestAdder (rate);
		Timer t=new Timer(1000, adder);
		t.start();
	}
	private class InterestAdder implements ActionListener
	{
		private double rate;
		public InterestAdder(double r)
		{
			rate=r;
		}
		public void actionPerformed(ActionEvent event)
		{
			double interest=balance*rate/100;
			balance+=interest;
			NumberFormat formatter=NumberFormat.getCurrencyInstance();
			System.out.println("Balance="+formatter.format(balance));
		}
	}
}

