package �޷�;
import java.util.Scanner;

public class �޷�_���ϱ��ϱ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int year=0, month=0, day=0, totalDays=0;
		String dayOfWeek = "";
		
		System.out.print("���ϴ� ������ �Է��ϼ���? ");
		year = myInput.nextInt();
		System.out.print("���ϴ� ���� �Է��ϼ���? ");
		month = myInput.nextInt();
		System.out.print("���ϴ� ���� �Է��ϼ���? ");
		day = myInput.nextInt();

		totalDays = (year - 1900) * 365  + (year-1900) / 4;
		if (year > 1901) {
			totalDays = (year - 1899) * 365;
					}
		totalDays++;
				
		switch(totalDays % 7) {
		case 0:
			dayOfWeek = "��";
			break;
		case 1:
			dayOfWeek = "��";
			break;
		case 2:
			dayOfWeek = "ȭ";
			break;
		case 3:
			dayOfWeek = "��";
			break;
		case 4:
			dayOfWeek = "��";
			break;
		case 5:
			dayOfWeek = "��";
			break;
		case 6:
			dayOfWeek = "��";
			break;
		}

		System.out.printf("\n1900�� 1�� 1�Ϻ��� %d�� %d�� %d�ϱ��� %d���� �������ϴ�.\n", year, month, day, totalDays);
		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�.\n\n", year, month, day, dayOfWeek);

//		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { 
//			leapDay=29;
//		 } else {
//			 leapDay=28;
//		 }
//		
//		System.out.printf("%d���� ���� ������ ������ �����ϴ�.\n", year);
//		for(month = 1; month < 13; month++) {
//			if( (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12) ) {
//				System.out.printf("%d�� %d��\n", month, day31);
//			} else if( (month == 4 ) || (month == 6) || (month == 9) || (month == 11) ){
//				System.out.printf("%d�� %d��\n", month, day30);
//			} else { 
//				System.out.printf("%d�� %d��\n", month, leapDay);
//			}
//		}
		
		myInput.close();
	}

}
