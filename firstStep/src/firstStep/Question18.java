package firstStep;

import java.util.Scanner;

public class Question18 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution1();
		solution2();
		solution3();
	}

	private static void solution3() {
		// TODO Auto-generated method stub
		
	}

	private static void solution2() {
		// TODO Auto-generated method stub
		
	}

	private static void solution1() {
		// TODO Auto-generated method stub
		System.out.println("홀수를 입력해주세요.");
		int size = sc.nextInt();
		for(int i = 0; i < (size+1)/2; i++ ) {
			for(int j = i+1; j < size; j++) {
				System.out.print("*");
			}
//			for(int j = 1; j < )
			System.out.println();
		}
	}

}
