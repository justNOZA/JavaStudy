package firstStep;

import java.util.Arrays;

public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[5];
		for(int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random()*50+1);
		}
		Arrays.sort(list);
		print(list);
	}

	private static void print(int[] sort) {
		int sum = 0;
		// TODO Auto-generated method stub
		for(int i = 0; i < sort.length; i++) {
			System.out.printf("num[%d]=%d ",i,sort[i]);
			sum += sort[i];
		}
		System.out.printf("\nÇÕ°è : %d", sum);
	}

}
