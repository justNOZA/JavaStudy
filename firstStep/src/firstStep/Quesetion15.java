package firstStep;

import java.util.Scanner;

public class Quesetion15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranNum = (int)(Math.random()*100);
		System.out.println("***난수가 발생하였습니다. ... 맞추어 보세요 ... ***");
		System.out.println(ranNum);
		int result = fitNumber(ranNum);
		
		System.out.println("축하합니다."+result+"번만에 맞추셨습니다.");
	}

	private static int fitNumber(int ranNum) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int check = 0;
		while (true) {
			check++;
			System.out.print("숫자 입력 : ");
			int a = sc.nextInt();
			System.out.println();
			if (a<ranNum) {
				System.out.println("컴퓨터의 숫자가 더 큽니다.");
			} else if (a > ranNum) {
				System.out.println("컴퓨터의 숫자가 더 작습니다.");
			} else {
				break;
			}
		}
		return check;
	}

}
