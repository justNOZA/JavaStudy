package firstStep;

import java.util.Scanner;

public class Question18 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		solution1();
		solution2();
//		solution3();
		star();
	}

	private static void solution3() {
		// TODO Auto-generated method stub
		
	}

	private static void solution2() {
		// TODO Auto-generated method stub
		
	}

	private static void solution1() {
		// TODO Auto-generated method stub
		System.out.println("Ȧ���� �Է����ּ���.");
		int size = sc.nextInt();
		for(int i = 0; i < (size+1)/2; i++ ) {
			for(int j = i+1; j < size; j++) {
				System.out.print("*");
			}
//			for(int j = 1; j < )
			System.out.println();
		}
	}
	
	private static void star() {
		int num = sc.nextInt();
		for (int i=0;i<num;i++){
		  for (int j=0; j<num;j++)
		  {
		     if (i<=num/2)// ���� ����
		     {
		        if (i+j<=num/2-1)// ���� �� �������
		           System.out.print(" ");
		        else if (j-i>=num/2+1) // ������ �� �������
		        	System.out.print(" ");
		        else
		           System.out.print("*");// *���
		     }
		     else if (i>num/2) //�Ʒ��� ����
		     {
		        if (i-j>=num/2+1) //���� �� ����
		        	System.out.print(" ");
		        else if (i+j>=num/2*3+1)//������ �� ����
		        	System.out.print(" ");
		        else
		        	System.out.print("*"); // *���
		     }
		  }
		  System.out.println();//�ٹٲ�
		}
	}

}
