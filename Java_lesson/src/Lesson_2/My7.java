package Lesson_2;

import javax.swing.JOptionPane;


public class My7 
{
	public static void main(String[] args)
	{
		System.out.println("It is program My7");
		abcd: //метка выхода из циклов
		for (int i3=1;i3<10;i3++)
	    {
	    for (int i2=1;i2<10;i2++)
	    {
	  
		String input=JOptionPane.showInputDialog("Variant (1,2,3,4,5)");
	    int i1=Integer.parseInt(input);
	    if (i1==55) break; //выход из текущего вложеного цикла
	    if (i1==66) continue; //прерывает последующие циклы, но не выходит из текущего
	    if (i1==77) break abcd; //выход по метке
	    switch(i1)
	    {
	    case 1:System.out.println("Variant one");break;
	    case 2:System.out.println("Variant two");break;
	    case 3:System.out.println("Variant three");break;
	    case 4:System.out.println("Variant four");break;
	    case 5:System.out.println("Variant five");break;
	    default:System.out.println("No variants");break;
	    }
	    System.out.println("Cycle "+i3+" "+i2);
	    }}
	    System.exit(0);
	}
}
