package �޷�;
import java.util.Scanner;

public class �޷�_�޷���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int year=0, month=0, day=0, totalDay=0;
		boolean isLeapYear = false;
		String dayOfWeek = "";
		
		System.out.print("���ϴ� ������ �Է��ϼ���? ");
		year = myInput.nextInt();
		System.out.print("���ϴ� ���� �Է��ϼ���? ");
		month = myInput.nextInt();
		System.out.print("���ϴ� ���� �Է��ϼ���? ");
		day = myInput.nextInt();

		totalDay = (year-1900)*365;
		
		switch(month) {
		case 12: totalDay = totalDay + 30;
		case 11: totalDay = totalDay + 31; 
		case 10: totalDay = totalDay + 30; 
		case 9: totalDay = totalDay + 31; 
		case 8: totalDay = totalDay + 31; 
		case 7: totalDay = totalDay + 30; 
		case 6: totalDay = totalDay + 31; 
		case 5: totalDay = totalDay + 30; 
		case 4: totalDay = totalDay + 31; 
		case 3: totalDay = totalDay + 28; 	
		case 2: totalDay = totalDay + 31; 
		}
		
//			if(month == 1) {
//				totalDay = totalDay + 0;
//			} else if (month == 2){
//				totalDay = totalDay + 0 + 31;
//			} else if (month == 3){
//				totalDay = totalDay + 0 + 31 + 28;
//			} else if (month == 4){
//				totalDay = totalDay + 0 + 31 + 28 + 31;
//			} else if (month == 5){
//				totalDay = totalDay + 0 + 31 + 28 + 31 + 30;
//			} else if (month == 6){
//				totalDay = totalDay + 0 + 31 + 28 + 31 + 30 + 31;
//			} else if (month == 7){
//				totalDay = totalDay + 0 + 31 + 28 + 31 + 30 + 31 + 30;
//			} else if (month == 8){
//				totalDay = totalDay + 0 + 31 + 28 + 31 + 30 + 31 + 30 + 31;
//			} else if (month == 9){
//				totalDay = totalDay + 0 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
//			} else if (month == 10){
//				totalDay = totalDay + 0 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
//			} else if (month == 11){
//				totalDay = totalDay + 0 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
//			} else if (month == 12){
//				totalDay = totalDay + 0 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 +30;
//			}
		
		// totalDays = totalDays + �Է¹��� ��¥����??
		totalDay = totalDay + day; 	

		// 1900�� ���� �Է¹��� �� ���� ������ ��� ��������?
		for(int index = 1900; index <= year; index++) {
			if ((index % 4 == 0 && index % 100 != 0) || index % 400 == 0) {  // ������ ���
					totalDay = totalDay + 1;
					if(year == index) {
						isLeapYear = true;
					}
			}

		}
	
		totalDay = totalDay - 1;
		if(isLeapYear && month <= 2) {
			totalDay = totalDay - 1;
		}
		
		switch(totalDay % 7) {
		case 0:
			dayOfWeek = "��";
			break;
		case 1:
			dayOfWeek = "ȭ";
			break;
		case 2:
			dayOfWeek = "��";
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
		
		System.out.printf("\n1900�� 1�� 1�Ϻ��� %d�� %d�� %d�ϱ��� %d���� �������ϴ�.\n", year, month, day, totalDay);
		System.out.printf("%d�� %d�� %d���� %s�����Դϴ�.\n\n", year, month, day, dayOfWeek);
		myInput.close();
	}
}
