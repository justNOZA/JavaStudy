package firstStep;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	[]month={31,28,31,30,31,30,31,31,30,31,30,31};
		Scanner sc = new Scanner(System.in);
		System.out.print("���ϴ� �� : ");
		int check = sc.nextInt();
		System.out.printf("\n���ϴ� �� %d���� %d���Դϴ�.",check,month[check-1]);
	}

}
