package firstStep;

import java.util.Scanner;

public class basicQuestion10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.print("input : ");
			char input = sc.nextLine().charAt(0);
			//scanner�� charŸ���� �޴� ���� ���� ������ String���� ���� ���� char�� ��ȯ
			//(String).charAt(inxdex)�Լ��� ���ڿ��� �ش� index�� ���ڸ� char�� ��ȯ�Ѵ�.
			System.out.println();
			solution(input);
		}
		for(int i = 0; i < 3; i++) {
			System.out.print("input : ");
			String input = sc.nextLine();
			//scanner�� charŸ���� �޴� ���� ���� ������ String���� ���� ���� char�� ��ȯ
			//(String).charAt(inxdex)�Լ��� ���ڿ��� �ش� index�� ���ڸ� char�� ��ȯ�Ѵ�.
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
			System.out.println("�Էµ����� ����");
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
			System.out.println("�Էµ����� ����");
		}
	}
	
}
