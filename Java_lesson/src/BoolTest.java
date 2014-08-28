//Демонстрация использования значений типаboolean.
public class BoolTest {
	public static void main(String args[]){
		boolean b;
		b = false;
		System.out.println("b равна" + b);
		b = true;
		System.out.println("b равна" + b);
		//значение типа bbolean может управлятьсяя оператором if
		if(b) System.out.println("Это выполняется");
		b = false;
		if(b) System.out.println("Это не выполняется");
		//результат сравнения значения типа bbolean
				System.out.println("Это выполняется" +(10>9));
	}

}
