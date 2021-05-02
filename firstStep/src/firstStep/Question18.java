package firstStep;

import java.util.Scanner;

public class Question18 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution1(); // number
		solution2(); // blank Dia
		solution3(); // square
//		star();
	}

	private static void solution3() {
		// TODO Auto-generated method stub
		System.out.println("3이상의 숫자를 입력하시오. v2");
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			if(i == 0 || i == size-1) {
				for(int j = 0; j < size*2; j++) {
					System.out.print("*");
				}
			}else {
				for(int k = 0; k < size*2; k++) {
					if(k == 0 || k == size*2-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

	private static void solution2() {
		// TODO Auto-generated method stub
		System.out.println("홀수를 입력하시오. v2");
		int size = sc.nextInt();
		for(int i = 0; i < (size+1)/2; i++) {
			for(int j = (size+1)/2-1; j >= 0; j--) {
				if(j == i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int k = i; k < 2*i; k++) {
				if(k == 2*i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = size/2; i > 0; i--) {
			for(int j = size/2+2; j > i; j--) {
				if(j == i+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			for(int k = (i-1)*2; k > 0; k--) {
				if(k == 1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

	private static void solution1() {
		// TODO Auto-generated method stub
		System.out.println("홀수를 입력해주세요. v1");
		int size = sc.nextInt();
		for(int i = 1; i <= (size+1)/2; i++ ) {
			for(int j = size; j > 2*i-1; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i = size/2; i > 0; i-- ) {
			for(int j = size; j > 2*i-1; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	private static void star() {
		int num = sc.nextInt();
		for (int i=0;i<num;i++){
		  for (int j=0; j<num;j++)
		  {
		     if (i<=num/2)// 위쪽 영역
		     {
		        if (i+j<=num/2-1)// 왼쪽 위 공백찍기
		           System.out.print(" ");
		        else if (j-i>=num/2+1) // 오른쪽 위 공백찍기
		        	System.out.print(" ");
		        else
		           System.out.print("*");// *찍기
		     }
		     else if (i>num/2) //아래쪽 영역
		     {
		        if (i-j>=num/2+1) //왼쪽 밑 공백
		        	System.out.print(" ");
		        else if (i+j>=num/2*3+1)//오른쪽 밑 공백
		        	System.out.print(" ");
		        else
		        	System.out.print("*"); // *찍기
		     }
		  }
		  System.out.println();//줄바꿈
		}
	}

}
