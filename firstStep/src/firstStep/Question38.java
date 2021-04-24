package firstStep;

import java.util.Scanner;

public class Question38 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 3) {
			intputAndPrint();
			i++;
		}
	}

	private static void intputAndPrint() {
		// TODO Auto-generated method stub
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		System.out.println(check(year));
	}

	private static String check(int year) {
		// TODO Auto-generated method stub
		if(year%4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return "윤년";
		}
		return "평년";
	}
	
}
