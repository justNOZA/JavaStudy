package firstStep;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		int r = sc.nextInt();
		test31 ob = new test31(r);
		ob.process();
		System.out.printf("\n원의 넓이 : %.2f",ob.output());
	}

}

class test31 {
	int r = 0;
	double size = 0.0;
	final double pi = 3.141592;
	
	public test31(int r) {
		this.r = r;
	}
	public void process() {
		this.size = this.r * this.r * this.pi;
	}
	public double output() {
		return this.size;
	}
}