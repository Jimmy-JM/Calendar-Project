package �޷�;
import java.util.Scanner;

public class �޷�_�޷����_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int inputYear, inputMonth, inputDay;
		int totalDays;
		boolean isLeapYear = false;
		System.out.print("�⵵ �Է� : ");
		inputYear = myInput.nextInt();
		System.out.print("�� �Է� : ");
		inputMonth = myInput.nextInt();
		System.out.print("�� �Է� : ");
		inputDay = myInput.nextInt();
		
		
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
		
		System.out.printf("1900�� 1�� 1�� ����, %d�� %d�� %d�� ���� �� %d�� �������ϴ�.\n", 
										inputYear, inputMonth, inputDay, totalDays);
		System.out.printf("%d�� %d�� %d���� %d���� �Դϴ�.", inputYear, inputMonth, inputDay, totalDays % 7);
		myInput.close();
	}

}