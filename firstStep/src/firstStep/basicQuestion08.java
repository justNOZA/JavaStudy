package firstStep;

import java.util.Scanner;

public class basicQuestion08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (true) {
			int a = scan.nextInt();
			if (a < 0 || a > 100) {
				System.out.println("�Է¿���");
			} else {
				System.out.println("�Էµ� �� : "+ a);
				break;
			}
		}
	}

}
