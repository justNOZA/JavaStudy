package firstStep;

import java.util.Scanner;

public class Quesetion15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ranNum = (int)(Math.random()*100);
		System.out.println("***������ �߻��Ͽ����ϴ�. ... ���߾� ������ ... ***");
		System.out.println(ranNum);
		int result = fitNumber(ranNum);
		
		System.out.println("�����մϴ�."+result+"������ ���߼̽��ϴ�.");
	}

	private static int fitNumber(int ranNum) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int check = 0;
		while (true) {
			check++;
			System.out.print("���� �Է� : ");
			int a = sc.nextInt();
			System.out.println();
			if (a<ranNum) {
				System.out.println("��ǻ���� ���ڰ� �� Ů�ϴ�.");
			} else if (a > ranNum) {
				System.out.println("��ǻ���� ���ڰ� �� �۽��ϴ�.");
			} else {
				break;
			}
		}
		return check;
	}

}
