package firstStep;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			if (start()) {
				break;
			}
		}
	}

	static Scanner sc = new Scanner(System.in);
	private static boolean start() {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*101);
		int check = 1;
		while (true) {
			if(checkingNum(num)) {
				break;
			}
			check++;
		}
		System.out.println("맞았다.("+check+")번");
		System.out.print("계속(y/n) : ");
		sc.nextLine();
		String result = sc.nextLine();
		switch (result) {
		case "y":
			return false;
		case "n":
			return true;
		default:
			System.out.println("게임을 다시 합니다.");
		}
		return false;
	}

	private static boolean checkingNum(int num) {
		// TODO Auto-generated method stub
		System.out.print("숫자입력(0~100) : ");
		int check = sc.nextInt();
		if(check < num) {
			System.out.println("\n작다");
		}else if( check > num) {
			System.out.println("\n크다");			
		}else {
			return true;						
		}
		return false;
	}

}
