//ƒемонстраци€ области видимости блока
public class Scope {
	public static void main(String args[]){
		//System.out.println("Hellow world!!!");
		int x;
		x=10;
		if(x==10){//область видимости переменной у
			int y=20;
			System.out.println("x and y" +x+ " "+y);
			x=y*2;
		}
     //y=100; // ќшибка! у не известна этой области
		//переменна€ х известна во всей области
		System.out.println("х=" + x);
	}
}
