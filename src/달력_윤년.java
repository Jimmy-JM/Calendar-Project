package �޷�;
import java.util.Scanner;

public class �޷�_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myInput = new Scanner(System.in);

		System.out.print("������? ");
		int year = myInput.nextInt();
		// ������ �ش� ������ 4�� ���� ���� 0�� �� �� 100���� ���� ���� 0�� ���� ���⿡�� �����ϰ�
		// 400���� ���� ���� 0�� ���� �������� �����Ѵ�
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { 
			System.out.println(year + "���� ����");
		} else {
			System.out.println(year + "���� ���");
		}
		myInput.close();
	}
}


