package firstStep;

import java.util.Scanner;

public class basicQuestion09 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = {"name","gender","age","tall"};
		String[] result = inputAndResult(list);
		printResult( result);
	}

	private static void printResult( String[] result) {
		System.out.println("�̸� : "+result[0]);
		System.out.println("���� : "+ (result[1].toUpperCase() == "M" ? "����" : "����"));
		System.out.println("���� : "+result[2]);
		System.out.printf("���� : %.2f",Double.parseDouble(result[3]));
	}

	private static String[] inputAndResult(String[] list) {
		// TODO Auto-generated method stub
		String[] result = new String[4];
		for(int i = 0; i < 4; i++) {
			System.out.print(list[i]+" : ");
			result[i] = sc.nextLine();
			System.out.println();
		}
		return result;
	}

}
