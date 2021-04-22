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
		System.out.println("이름 : "+result[0]);
		System.out.println("성별 : "+ (result[1].toUpperCase() == "M" ? "남자" : "여자"));
		System.out.println("나이 : "+result[2]);
		System.out.printf("신장 : %.2f",Double.parseDouble(result[3]));
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
