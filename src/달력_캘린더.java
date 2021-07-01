package 달력;
import java.util.Scanner;

public class 달력_캘린더 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int inputYear, inputMonth, inputDay, endOfMonth = 0;
		int totalDays;
		boolean isLeapYear = false;
		String dayOfWeek = "";
		
		System.out.print("년도 입력 : ");
		inputYear = myInput.nextInt();
		System.out.print("월 입력 : ");
		inputMonth = myInput.nextInt();
//		System.out.print("일 입력 : ");
//		inputDay = myInput.nextInt();
		inputDay = 1;
		
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
			
		switch(totalDays % 7) {
		case 0:
			dayOfWeek = "월";
			break;
		case 1:
			dayOfWeek = "화";
			break;
		case 2:
			dayOfWeek = "수";
			break;
		case 3:
			dayOfWeek = "목";
			break;
		case 4:
			dayOfWeek = "금";
			break;
		case 5:
			dayOfWeek = "토";
			break;
		case 6:
			dayOfWeek = "일";
			break;
		}

		System.out.println();
		System.out.printf("1900년 1월 1일 이후, %d년 %d월 %d일 까지 총 %d일 지났습니다.\n", inputYear, inputMonth, inputDay, totalDays);
		System.out.printf("%d년 %d월 %d일은 %s요일 입니다.", inputYear, inputMonth, inputDay, dayOfWeek);
		System.out.println();
		
	    //달력 출력
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
		System.out.printf("\n             %d년 %d월\n\n", inputYear, inputMonth);
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
