package 달력;
import java.util.Scanner;

public class 달력_월말일구하기 {

	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		int year=0, month=0, yun=0, day31=31, day30=30;
		
		System.out.print("연도는? ");
		year = myInput.nextInt();
		System.out.printf("%d년의 월별 말일은 다음과 같습니다.\n", year);

		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { 
			yun=29;
		 } else {
			yun=28;
		 }
	
		for(month = 1; month < 13; month++) {
			if( (month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12) ) {
				System.out.printf("%d월 %d일\n", month, day31);
			} else if( (month == 4 ) || (month == 6) || (month == 9) || (month == 11) ){
				System.out.printf("%d월 %d일\n", month, day30);
			} else { 
				System.out.printf("%d월 %d일\n", month, yun);
			}
			myInput.close();
		}
	}
}



	

	
	
