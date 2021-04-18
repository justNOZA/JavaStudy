package firstStep;

import java.util.Scanner;

public class basicQuestion05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int mat = scan.nextInt();
		int sum = kor + eng + mat;
		printGrade(name,sum);
	}

	private static void printGrade(String name, int kor) {
		// TODO Auto-generated method stub
		System.out.println("이름 : "+name);
		System.out.println("합계 점수 : "+ kor);
		System.out.printf("평균 점수 : %.1f",(kor/3.0)); //f에 int값이 들어오면 안되고, 0.1f가 아닌 .1f로 표기해야 한다.
		
	}

}
