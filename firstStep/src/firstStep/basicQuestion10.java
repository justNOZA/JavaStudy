package firstStep;

import java.util.Scanner;

public class basicQuestion10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.print("input : ");
			char input = sc.nextLine().charAt(0);
			//scanner에 char타입을 받는 것이 없기 때문에 String으로 받은 다음 char로 변환
			//(String).charAt(inxdex)함수는 문자열의 해당 index의 글자를 char로 반환한다.
			System.out.println();
			solution(input);
		}
		for(int i = 0; i < 3; i++) {
			System.out.print("input : ");
			String input = sc.nextLine();
			//scanner에 char타입을 받는 것이 없기 때문에 String으로 받은 다음 char로 변환
			//(String).charAt(inxdex)함수는 문자열의 해당 index의 글자를 char로 반환한다.
			System.out.println();
			solution(input);
		}
		
	}

	private static void solution(String input) {
		// TODO Auto-generated method stub
		String up = input.toUpperCase();
		String down = input.toLowerCase();
//		System.out.println(down+up);
		if(up == input && input != down) {
			System.out.println("result : "+down);
		} else if(down == input && up != input) {
			System.out.println("result : "+up);
		} else {
			System.out.println("입력데이터 오류");
		}
	}

	private static void solution(char input) {
		// TODO Auto-generated method stub
		char up = Character.toUpperCase(input);
		char down = Character.toLowerCase(input);
//		System.out.println(down+" "+up);
		if(up == input && input != down) {
			System.out.println("result : "+down);
		} else if(down == input && up != input) {
			System.out.println("result : "+up);
		} else {
			System.out.println("입력데이터 오류");
		}
	}
	
}
