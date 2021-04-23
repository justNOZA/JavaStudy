package firstStep;

import java.util.Scanner;

public class basicQuestion11 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution();
	}

	private static void solution() {
		// TODO Auto-generated method stub
		System.out.print("A값을 입력하시오. : ");
		int a = sc.nextInt();
		System.out.print("\nB값을 입력하시오. : ");
		int b = sc.nextInt();
		System.out.print("\n연산자를 입력하시오. : ");
		sc.nextLine();
		String c = sc.nextLine();
		
		switch (c) {
		case "+":
			print(a,b,c);
			System.out.println(a+b);
			break;
		case "-":
			print(a,b,c);
			System.out.println(a-b);
			break;
		case "*":
			print(a,b,c);
			System.out.println(a*b);
			break;
		case "/":
			print(a,b,c);
			System.out.printf("%.2f",(double)a/b);
			break;
		default :
			System.out.println("\n 연산자 error");
		}
	}
	
	public static void print(int a, int b, String c) {
		System.out.print("\n"+a +" "+ c + " " + b + " = ");
	}

}
