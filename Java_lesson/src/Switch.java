//������������������� ������ ��������� � ��������� ����.
public class Switch {
		
	public static void main (String args[]){
		int month=4;
		String season;
		switch (month) {
		case 12:
		case 1:
		case 2:
			season="����";
		case 3:
		case 4:
		case 5:
			season="�����";
		case 6:
		case 7:
			
		case 8:
			season="����";
		case 9:
		case 10:
		case 11:
			season="�����";
		default:
			season = "����������� �������";
		}
		System.out.println("������ ���������� �"+season+".");
	}
}
