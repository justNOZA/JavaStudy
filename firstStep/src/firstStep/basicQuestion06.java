package firstStep;

import java.util.Scanner;

public class basicQuestion06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int bottom = scan.nextInt();
		scan.nextLine(); //nextInt는 입력받은 숫자만 가져오고space가 남음, nextLine은 space까지 출력이기 때문에 
		//nextInt를 쓰고 난 다음에 nextLine을 쓰면 추가 입력 없이 space가 빠져나가게 된다.
		int height = scan.nextInt();
		
		printTriangleArea(bottom,height);
	}

	private static void printTriangleArea(int bottom, int height) {
		// TODO Auto-generated method stub
		double area = bottom*height/2;
		System.out.printf("삼각형의 넓이 : %.2f",area);
	}

}
