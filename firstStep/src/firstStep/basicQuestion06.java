package firstStep;

import java.util.Scanner;

public class basicQuestion06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int bottom = scan.nextInt();
		scan.nextLine(); //nextInt�� �Է¹��� ���ڸ� ��������space�� ����, nextLine�� space���� ����̱� ������ 
		//nextInt�� ���� �� ������ nextLine�� ���� �߰� �Է� ���� space�� ���������� �ȴ�.
		int height = scan.nextInt();
		
		printTriangleArea(bottom,height);
	}

	private static void printTriangleArea(int bottom, int height) {
		// TODO Auto-generated method stub
		double area = bottom*height/2;
		System.out.printf("�ﰢ���� ���� : %.2f",area);
	}

}
