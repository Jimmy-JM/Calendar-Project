package 달력;
import java.util.Scanner;

public class 달력_달력출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int year=0, month=0, day=0, totalDay=0;
		boolean isLeapYear = false;
		String dayOfWeek = "";
		
		System.out.print("원하는 연도를 입력하세요? ");
		year = myInput.nextInt();
		System.out.print("원하는 월을 입력하세요? ");
		month = myInput.nextInt();
		System.out.print("원하는 일을 입력하세요? ");
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
		
		// totalDays = totalDays + 입력받은 날짜까지??
		totalDay = totalDay + day; 	

		// 1900년 부터 입력받은 날 까지 윤년은 몇번 나왔을까?
		for(int index = 1900; index <= year; index++) {
			if ((index % 4 == 0 && index % 100 != 0) || index % 400 == 0) {  // 윤년일 경우
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
		
		System.out.printf("\n1900년 1월 1일부터 %d년 %d월 %d일까지 %d일이 지났습니다.\n", year, month, day, totalDay);
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.\n\n", year, month, day, dayOfWeek);
		myInput.close();
	}
}
