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
		System.out.println("�¾Ҵ�.("+check+")��");
		System.out.print("���(y/n) : ");
		sc.nextLine();
		String result = sc.nextLine();
		switch (result) {
		case "y":
			return false;
		case "n":
			return true;
		default:
			System.out.println("������ �ٽ� �մϴ�.");
		}
		return false;
	}

	private static boolean checkingNum(int num) {
		// TODO Auto-generated method stub
		System.out.print("�����Է�(0~100) : ");
		int check = sc.nextInt();
		if(check < num) {
			System.out.println("\n�۴�");
		}else if( check > num) {
			System.out.println("\nũ��");			
		}else {
			return true;						
		}
		return false;
	}

}
