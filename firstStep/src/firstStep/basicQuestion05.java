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
		System.out.println("�̸� : "+name);
		System.out.println("�հ� ���� : "+ kor);
		System.out.printf("��� ���� : %.1f",(kor/3.0)); //f�� int���� ������ �ȵǰ�, 0.1f�� �ƴ� .1f�� ǥ���ؾ� �Ѵ�.
		
	}

}
