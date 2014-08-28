//÷елева€ часть цикла может быть пустой
public class NoBody {
	public static void main(String args[]){
		int i, j;
		i=100;
		j=200;
		//вычисление среднего значени€ i и j
		while (++i<--j); 
		System.out.println("—реднее значение равно"+i);
	}

}
