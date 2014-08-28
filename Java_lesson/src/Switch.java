//усовершенствованная версия программы с временами года.
public class Switch {
		
	public static void main (String args[]){
		int month=4;
		String season;
		switch (month) {
		case 12:
		case 1:
		case 2:
			season="зиме";
		case 3:
		case 4:
		case 5:
			season="весне";
		case 6:
		case 7:
			
		case 8:
			season="лету";
		case 9:
		case 10:
		case 11:
			season="осени";
		default:
			season = "вымышленным месяцам";
		}
		System.out.println("Апрель относиться к"+season+".");
	}
}
