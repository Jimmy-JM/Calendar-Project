package 달력;
import java.util.Scanner;

public class 달력_요일구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);
		int year=0, month=0, day=0, totalDays=0;
		String dayOfWeek = "";
		
		System.out.print("원하는 연도를 입력하세요? ");
		year = myInput.nextInt();
		System.out.print("원하는 월을 입력하세요? ");
		month = myInput.nextInt();
		System.out.print("원하는 일을 입력하세요? ");
		day = myInput.nextInt();

		totalDays = (year - 1900) * 365  + (year-1900) / 4;
		if (year > 1901) {
			totalDays = (year - 1899) * 365;
					}
		totalDays++;
				
		switch(totalDays % 7) {
		case 0:
			dayOfWeek = "일";
			break;
		case 1:
			dayOfWeek = "월";
			break;
		case 2:
			dayOfWeek = "화";
			break;
		case 3:
			dayOfWeek = "수";
			break;
		case 4:
			dayOfWeek = "목";
			break;
		case 5:
			dayOfWeek = "금";
			break;
		case 6:
			dayOfWeek = "토";
			break;
		}

		System.out.printf("\n1900년 1월 1일부터 %d년 %d월 %d일까지 %d일이 지났습니다.\n", year, month, day, totalDays);
		System.out.printf("%d년 %d월 %d일은 %s요일입니다.\n\n", year, month, day, dayOfWeek);

//		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { 
//			leapDay=29;
//		 } else {
//			 leapDay=28;
//		 }
//		
//		System.out.printf("%d년의 월별 말일은 다음과 같습니다.\n", year);
//		for(month = 1; month < 13; month++) {
//			if( (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12) ) {
//				System.out.printf("%d월 %d일\n", month, day31);
//			} else if( (month == 4 ) || (month == 6) || (month == 9) || (month == 11) ){
//				System.out.printf("%d월 %d일\n", month, day30);
//			} else { 
//				System.out.printf("%d월 %d일\n", month, leapDay);
//			}
//		}
		
		myInput.close();
	}

}
