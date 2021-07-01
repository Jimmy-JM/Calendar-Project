package �޷�;
import java.util.Scanner;

public class �޷�_Ķ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int inputYear, inputMonth, inputDay, endOfMonth = 0;
		int totalDays;
		boolean isLeapYear = false;
		String dayOfWeek = "";
		
		System.out.print("�⵵ �Է� : ");
		inputYear = myInput.nextInt();
		System.out.print("�� �Է� : ");
		inputMonth = myInput.nextInt();
//		System.out.print("�� �Է� : ");
//		inputDay = myInput.nextInt();
		inputDay = 1;
		
		// 1900�� ���� �Է¹��� �� ���� ���� ��������? 
		// 1900�� ���� �Է¹��� �⵵ 1�� 1�� ���� ����?
		totalDays = 0;
		totalDays = (inputYear - 1900) * 365;
		// �Է¹��� �⵵ 1�� 1�� ����, �Է¹��� ��¥������ ���� ��������? 
		// �Է¹��� �⵵ 1�� 1�� ����, �Է¹��� �� 1�� ������ ����?
		switch(inputMonth) {
			case 12: totalDays = totalDays + 30; 
			case 11: totalDays = totalDays + 31; 
			case 10: totalDays = totalDays + 30; 
			case 9: totalDays = totalDays + 31; 
			case 8: totalDays = totalDays + 31;
			case 7: totalDays = totalDays + 30;
			case 6: totalDays = totalDays + 31;
			case 5: totalDays = totalDays + 30;
			case 4: totalDays = totalDays + 31; 
			case 3: totalDays = totalDays + 28;
			case 2: totalDays = totalDays + 31;
		}


		//totalDays = totalDays + �Է¹��� ��¥����??
		totalDays = totalDays + inputDay; 
				
		// 1900�� ���� �Է¹��� �� ���� ������ ��� ��������?
		for(int index = 1900; index <= inputYear; index++) {
			if(((index % 4) == 0 && (index % 100) != 0)	|| (index % 400) == 0 ){				
					totalDays = totalDays + 1;
					if(inputYear == index) {
						isLeapYear = true;
					}
			} 
		}
		totalDays = totalDays - 1;
		if(isLeapYear && inputMonth <= 2) {
			totalDays = totalDays - 1;
		}
			
		switch(totalDays % 7) {
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

		System.out.println();
		System.out.printf("1900�� 1�� 1�� ����, %d�� %d�� %d�� ���� �� %d�� �������ϴ�.\n", inputYear, inputMonth, inputDay, totalDays);
		System.out.printf("%d�� %d�� %d���� %s���� �Դϴ�.", inputYear, inputMonth, inputDay, dayOfWeek);
		System.out.println();
		
	    //�޷� ���
		switch(inputMonth) {
			case 12: endOfMonth = 31; break; 
			case 11: endOfMonth = 30; break; 
			case 10: endOfMonth = 31; break; 
			case 9: endOfMonth = 30; break; 
			case 8: endOfMonth = 31; break; 
			case 7: endOfMonth = 31; break; 
			case 6: endOfMonth = 30; break; 
			case 5: endOfMonth = 31; break; 
			case 4: endOfMonth = 30; break; 
			case 3: endOfMonth = 21; break; 
			case 2: endOfMonth = 28; break; 
			case 1: endOfMonth = 31; break; 
		}
		if(isLeapYear && inputMonth == 2) {
			endOfMonth++;
		}
		int current = totalDays % 7;
		current++;
		if(current >= 7) {
			current = 0;
		}
		System.out.printf("\n             %d�� %d��\n\n", inputYear, inputMonth);
		System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		for(int spaceCount = 0; spaceCount < current; spaceCount++) {
			System.out.printf("%5s", "");
		}
		for(int day = 1; day <= endOfMonth; day++) {
			current++;
			System.out.printf("%5d", day);
			if(current % 7 == 0) {
				System.out.println();
			}			
		}
		
		myInput.close();
	}

}
