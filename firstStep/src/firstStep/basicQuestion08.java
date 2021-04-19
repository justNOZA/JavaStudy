package firstStep;

import java.util.Scanner;

public class basicQuestion08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			int a = scan.nextInt();
			if (a < 0 || a > 100) {
				System.out.println("입력오류");
			} else {
				System.out.println("입력된 값 : "+ a);
				break;
			}
		}
	}

}
