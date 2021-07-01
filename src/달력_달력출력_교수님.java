package 달력;
import java.util.Scanner;

public class 달력_달력출력_교수님 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int inputYear, inputMonth, inputDay;
		int totalDays;
		boolean isLeapYear = false;
		System.out.print("년도 입력 : ");
		inputYear = myInput.nextInt();
		System.out.print("월 입력 : ");
		inputMonth = myInput.nextInt();
		System.out.print("일 입력 : ");
		inputDay = myInput.nextInt();
		
		
		// 1900년 부터 입력받은 날 까지 몇일 지났을까? 
		// 1900년 부터 입력받은 년도 1월 1일 까지 몇일?
		totalDays = 0;
		totalDays = (inputYear - 1900) * 365;
		// 입력받은 년도 1월 1일 부터, 입력받은 날짜까지는 몇일 지났을까? 
		// 입력받은 년도 1월 1일 부터, 입력받은 월 1일 까지는 몇일?
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
		//totalDays = totalDays + 입력받은 날짜까지??
		totalDays = totalDays + inputDay; 
				
		// 1900년 부터 입력받은 날 까지 윤년은 몇번 나왔을까?
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
		
		System.out.printf("1900년 1월 1일 이후, %d년 %d월 %d일 까지 총 %d일 지났습니다.\n", 
										inputYear, inputMonth, inputDay, totalDays);
		System.out.printf("%d년 %d월 %d일은 %d요일 입니다.", inputYear, inputMonth, inputDay, totalDays % 7);
		myInput.close();
	}

}