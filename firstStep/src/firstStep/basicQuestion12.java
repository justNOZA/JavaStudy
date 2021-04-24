package firstStep;

import java.util.Scanner;

public class basicQuestion12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = inputGrade();
		printResult(in);
	}

	private static void printResult(int[] in) {
		// TODO Auto-generated method stub
		System.out.println("중간고사 : "+in[0]);
		System.out.println("기말고사 : "+in[1]);
		System.out.println("레포트 : "+in[2]);
		System.out.println("출석 : "+in[3]);
		String[] result = evaluate(in);
		System.out.println("성적 = "+result[0]);
		System.out.println("학점 = "+result[1]);
		System.out.println("평가 = "+result[2]);
	}

	private static String[] evaluate(int[] in) {
		// TODO Auto-generated method stub
		String[] result = new String[3];
		double a = (double)(in[0]+in[1])/2*3;
		double b = a + in[2] + in[3];
		result[0] = String.format("%.2f", b/5);
		
		if(b >= 90) {
			result[1] = "A";
		}else if( b >= 80) {
			result[1] = "B";
		}else if( b >= 80) {
			result[1] = "C";			
		}else if( b >= 80) {
			result[1] = "D";
		}else {
			result[1] = "F";
		}
		
		switch (result[1]) {
		case "A":
		case "B":
			result[2] = "excellent";
			break;
		case "C":
		case "D":
			result[2] = "good";			
			break;
		default:
			result[2] = "poor";
			break;
		}
		return result;
	}

	private static int[] inputGrade() {
		// TODO Auto-generated method stub
		int[] result = new int[4];
		Scanner sc = new Scanner(System.in);
		System.out.print("중간고사를 입력하시오 : ");
		result[0] = sc.nextInt();
		System.out.print("\n기말고사를 입력하시오 : ");
		result[1] = sc.nextInt();
		System.out.print("\n레포트고사를 입력하시오 : ");
		result[2] = sc.nextInt();
		System.out.print("\n출석고사를 입력하시오 : ");
		result[3] = sc.nextInt();
		
		return result;
	}

}
