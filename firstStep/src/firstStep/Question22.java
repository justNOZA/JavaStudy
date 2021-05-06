package firstStep;

import java.util.Scanner;

public class Question22 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("입력할 양을 정해주세요.");
		double[] result = input(sc.nextInt());
		print(result);
	}
	private static void print(double[] result) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 0; i < result.length; i++) {
			sum += result[i];
		}
		String arg = String.format("%.2f", sum/result.length);
		System.out.println("\n평균 : "+arg);
	}
	private static double[] input(int nextInt) {
		// TODO Auto-generated method stub
		double[] data = new double[nextInt];
		for(int i = 0; i < data.length; i++) {
			System.out.print("\nscore["+i+"] :");
			data[i] = sc.nextDouble();
		}
		return data;
	}

}
