package firstStep;

import java.util.Scanner;

public class Question21 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-�Է�-");
		System.out.print("ǰ�� : ");
		String item = sc.nextLine();
		System.out.print("\n���� : ");
		int qty = sc.nextInt(); 
		System.out.print("\n�ܰ� : ");
		int price = sc.nextInt();
		
		compute(item,qty,price);
	}
	private static void compute(String item, int qty, int price) {
		// TODO Auto-generated method stub
		int result = qty * price;
		
		System.out.println("-���-");
		System.out.printf("ǰ�� : %s\n",item);
		System.out.printf("�ݾ� : %d��",result);
	}

}
