package firstStep;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.print("X값을 입력하시오 : ");
		 int x = sc.nextInt();
		 System.out.print("\nY값을 입력하시오 : ");
		 int y = sc.nextInt();
		 int result = 1;
		 for(int i = 0; i < y; i++) {
			 result *= x;
		 }
		 System.out.println(x+"의 "+y+"승은 "+result);
	}

}
