package firstStep;

import java.util.Scanner;

public class Question21 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-입력-");
		System.out.print("품명 : ");
		String item = sc.nextLine();
		System.out.print("\n수량 : ");
		int qty = sc.nextInt(); 
		System.out.print("\n단가 : ");
		int price = sc.nextInt();
		
		compute(item,qty,price);
	}
	private static void compute(String item, int qty, int price) {
		// TODO Auto-generated method stub
		int result = qty * price;
		
		System.out.println("-출력-");
		System.out.printf("품명 : %s\n",item);
		System.out.printf("금약 : %d원",result);
	}

}
