package firstStep;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class T33{
	double area;
	final double PI = 3.141592;
	public T33() {
		this.area = 0.0;
	}
	public double circle(double r) {
		return r*r*this.PI;
	}
	public double triangle(double h, double b) {
		return h*b*0.5;
	}
	public double trapezoid(double t, double b, double h) {
		return (t+b)/2*h;
	}
	public void output() {
		
	}
	public int menu() {
		System.out.println("**** 도 형 선 택 ****");
		System.out.println("1. 삼각형");
		System.out.println("2. 원");
		System.out.println("3. 사다리꼴");
		System.out.println("4. 종료");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			break;
		case 2 :
			break;
		case 3 :
			break;
		case 4 :
			System.out.println("감사합니다.");
		}
		return num;
	}
}