package 달력;
import java.util.Scanner;

public class 달력_윤년 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);

		System.out.print("연도는? ");
		int year = myInput.nextInt();
		// 윤년은 해당 연도를 4로 나눈 값이 0인 것 중 100으로 나눈 값이 0인 것은 윤년에서 제외하고
		// 400으로 나눈 값이 0인 것은 윤년으로 포함한다
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { 
			System.out.println(year + "년은 윤년");
		} else {
			System.out.println(year + "년은 평년");
		}
		myInput.close();
	}
}


